package edu.acc.java2.readtext;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args){
        final String PATH = "C:\\Users\\javauser\\Desktop\\index.html";
        try (BufferedReader br = new BufferedReader(new FileReader(PATH))) {
            String line;
            int lineno = 0;
            while ((line = br.readLine()) != null) {
                lineno++;
                System.out.printf("%03d) %s\n", lineno, line);
            }
        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

}
