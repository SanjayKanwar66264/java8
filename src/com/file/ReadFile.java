package com.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by sanjay kanwar on 10/02/2017.
 */
public class ReadFile {
    public static void main(String[] args) {
        String fileName = "/Users/sanjaykanwar/java/javabyexamples/GoodMorning.txt";
        readFile(fileName);
    }

    private static void  readFile(String fileName){
        FileReader fileReader;
        BufferedReader bufferedReader;

        try {
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            bufferedReader = null;
            fileReader = null;
        }

    }
}
