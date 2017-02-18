package com.file;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;

/**
 * Created by sanjay kanwar on 9/02/2017.
 */
public class DirectoryListing {
    public static void main(String[] args) {
        ArrayList dirs = new ArrayList();
        String dirPath = "/Users/sanjaykanwar/development/sbr";
        File baseDir = new File(dirPath);
        getDirectories(baseDir, dirs);
        File dir;
        for(int count = 0; count < dirs.size(); count++){
            dir =(File) dirs.get(count);
            System.out.println(dir.getAbsolutePath());
        }
    }

    public static void getDirectories(File dir, ArrayList dirs){
        File[] subDirs = dir.listFiles(new DirectoryFilter());
        for (int count =0; count < subDirs.length; count++){
            File subdir = subDirs[count];
            dirs.add(subdir);
            getDirectories(subdir, dirs);
        }

    }
}

class DirectoryFilter implements FileFilter{
    public boolean accept(File file){ return file.isDirectory();}
}
