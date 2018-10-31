package edu.acc.java2.writetext;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        final String PATH = "C:\\Users\\javauser\\Desktop\\index.html";
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(PATH)))) {
            pw.append("<!DOCTYPE html>\n")
                .append("<html>\n")
                .append("<body>\n")
                .append("<h1><font color=\"red\">This is terrific!</font></h1>\n")
                .append("</body>\n")
                .append("</html>");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
