package com.file;

import java.io.File;
import java.io.IOException;

import static java.lang.System.*;

/**
 * Created by sanjay kanwar on 9/02/2017.
 */
public class FileExample {

    public static void main(String[] args) throws IOException {
        String dirPath = "/Users/sanjaykanwar/java/javabyexamples";
        File baseDir = new File(dirPath);
        if(baseDir.exists()){
            File[] files = baseDir.listFiles();
            try {
                out.println(baseDir.getCanonicalPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
            File file;
            for (File file1 : files) {
                if (file1.isDirectory()) {
                    out.println("This is a directory " + file1.getName());
                } else {
                    out.println("This is a file " + file1.getName());
                }
            }
        }
        else{
            out.println("Base Dir doesnt exists");
        }
    }
}
