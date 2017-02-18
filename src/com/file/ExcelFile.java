package com.file;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.*;
import java.util.Iterator;

/**
 * Created by sarvesh on 4/3/16.
 */
public class ExcelFile {
    public static void main( String[] args ) {
        String fileName = "/Users/sanjaykanwar/java/javabyexamples/Employees.xlsx";
        String incrementFileName = "/Users/sanjaykanwar/java/javabyexamples/SalaryIncrement3.xlsx";
        calculateIncrements( fileName, incrementFileName );
    }



    public static void calculateIncrements( String fileName, String incrementFileName ) {
        try {
            FileInputStream fis = new FileInputStream(fileName);
            XSSFWorkbook workbook = new XSSFWorkbook( fis );
            XSSFSheet sheet = workbook.getSheetAt(0);
            XSSFWorkbook oworkbok = new XSSFWorkbook();
            XSSFSheet osheet = oworkbok.createSheet();
            int rownum = 0;
            //Get iterator to all the rows in current sheet
            Iterator<Row> rowIterator = sheet.iterator();
            while( rowIterator.hasNext() ) {
                Row row = rowIterator.next();
                Row orow = osheet.createRow( rownum++ );
                Iterator<Cell> cellIterator = row.cellIterator();
                int cellnum = 0;
                while( cellIterator.hasNext() ) {
                    Cell cell = cellIterator.next();
                    Cell ocell = orow.createCell( cellnum++ );
                    switch( cell.getCellType() ) {
                        case Cell.CELL_TYPE_STRING :
                            System.out.print( cell.getStringCellValue() + "\t " );
                            ocell.setCellValue( cell.getStringCellValue());
                            break;
                        case Cell.CELL_TYPE_NUMERIC :
                            System.out.print( cell.getNumericCellValue() + "\t " );
                            ocell.setCellValue( cell.getNumericCellValue() );
                            break;
                        case Cell.CELL_TYPE_BLANK :
                            break;
                        default:
                            System.out.println( "Unhandled Cell Type: " + cell.getCellType() );

                    }
                }
                System.out.println( "" );
                Cell ocell = orow.createCell( cellnum++ );
                if( rownum == 1 ) {
                    //set the title of the column - New Salary
                    ocell.setCellValue( "New Salary" );
                }
                else {
                    Cell oldSalaryCell = row.getCell( 5 );
                    if ( oldSalaryCell != null ){
                        double oldSalary = oldSalaryCell.getNumericCellValue();
                        ocell.setCellValue(oldSalary * 1.15);
                        System.out.println( "New Salary: " + oldSalary * 1.15 );
                    }
                }

            }
            fis.close();

            //Write to the file
            FileOutputStream out = new FileOutputStream(new File(incrementFileName));
            oworkbok.write(out);
            out.close();
            System.out.println( "Created increment file" );
        }
        catch( FileNotFoundException ex ) {
            System.out.println( "File not found exception " );
            System.out.println( ex.getMessage() );
            ex.printStackTrace();
        }
        catch( IOException ioex ) {
            System.out.println( "File not found exception " );
            System.out.println( ioex.getMessage() );
            ioex.printStackTrace();
        }
    }


}
