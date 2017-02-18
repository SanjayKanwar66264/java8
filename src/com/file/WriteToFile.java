package com.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by sanjay kanwar on 11/02/2017.
 */
public class WriteToFile {
    public static void main(String[] args) {
        String file = "/Users/sanjaykanwar/java/javabyexamples/tests.txt";
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter;
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Hello this is a buffered writee");
            bufferedWriter.newLine();
            bufferedWriter.write("Hello this is a buffered writee");
            bufferedWriter.newLine();
            bufferedWriter.write("Hello this is a buffered writee");
            bufferedWriter.newLine();
            bufferedWriter.write("Hello this is a buffered writee");
            bufferedWriter.newLine();
            bufferedWriter.write("Hello this is a buffered writee");
            bufferedWriter.newLine();
            bufferedWriter.write("Hello this is a buffered writee");
            bufferedWriter.newLine();
            bufferedWriter.write("Hello this is a buffered writee");
            bufferedWriter.newLine();
            bufferedWriter.write("Hello this is a buffered writee");
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    }

