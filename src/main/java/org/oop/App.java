package org.oop;

import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) {

        // I/O
        File file = new File("/Users/MariuszBorek/Documents/");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }

        File fileSe = new File("/Users/MariuszBorek/Desktop/fileCreatedByJavaCode.txt");
        try {
            fileSe.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
