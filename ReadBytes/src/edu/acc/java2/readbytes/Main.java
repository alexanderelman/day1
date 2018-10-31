package edu.acc.java2.readbytes;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        final String PATH = "C:\\Users\\javauser\\Desktop\\ints";
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(PATH))) {
            for (int n = 0; n < 100; n++) {
                int b = bis.read();
                System.out.printf("%d ", b);
            }          
        }
        catch (FileNotFoundException fnfe) {
            System.out.println("Can't access file. " + fnfe.getMessage());
        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

    }

}
