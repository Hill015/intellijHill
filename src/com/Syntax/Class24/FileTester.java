package com.Syntax.Class24;

public class FileTester {
    public static void main(String[] args) {
        File[] files={new JavaFile(),new pdfFile(),new wordFile()};
        for (int i=0; i<files.length;i++){
            files[i].openFile();
            files[i].editFile();
            files[i].closeFile();
        }

    }
}