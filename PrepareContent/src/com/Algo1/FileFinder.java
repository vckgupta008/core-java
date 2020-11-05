package com.Algo1;
import java.io.File;

public class FileFinder {
    public void findFile(String fileName, String inputPath) {
        File directory = new File(inputPath);
        if (directory.isDirectory()) {
            File[] list = directory.listFiles();
            for (File file : list) {
                if (file.isDirectory()) {
                    findFile(fileName, file.getAbsolutePath());
                } else if (fileName.equals(file.getName())) {
                    System.out.println(inputPath + "/" + fileName + "found");
                }
            }
        }
    }

    public static void main(String args[]) {
        String projectPath = System.getProperty("user.dir");
        FileFinder fileFinder = new FileFinder();
        fileFinder.findFile("Algorithms.iml", projectPath);
    }
}
