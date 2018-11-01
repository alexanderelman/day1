package edu.acc.java2.hw1;

import java.io.FileInputStream;
import java.io.DataInputStream;

public class Main {

    public static void main( String [] args ) {
        final String PATH = "/home/aelman/Coding/Java2/day1/hw1/day1.dat";
        try (DataInputStream day1dataistream = new DataInputStream(new FileInputStream(PATH))) {
            
        }
    }
}
