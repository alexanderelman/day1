package edu.acc.java2.writebytes;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * A Java program to commit 100 ints to disk, ranged from 0 to 99.
 * Note how only 4 of the 40 lines of this program actually DO the work
 * @author javauser
 */
public class Main {

    public static void main(String[] args) {
        final String PATH = "C:\\Users\\javauser\\Desktop\\ints";
        // have to declare streams outside of the try block so they'll
        // be accessible in the finally
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        // had to assign them null so they won't be undefined if
        // their constructor calls fail
        try {
            fos = new FileOutputStream(PATH);
            bos = new BufferedOutputStream(fos);
            for (int n = 0; n < 100; n++) {
                bos.write(n);
            }
        } catch (IOException ioe) {
            System.out.println("Program failed: " + ioe.getMessage());
        } finally { // have to remember to close the streams in reverse order of creation
            if (bos != null) // bos would be null if fos constructor threw an exception
                try { bos.close(); } // have to try because close() throws a checked exception
                catch (IOException ioe) {} // can't actually recover from a failed close
            if (fos != null) // fos would be null if fos constructor threw an exception
                try { fos.close(); } // have to try because close() throws a checked exception
                catch (IOException ioe) {} // can't actually recover from a failed close
        }
    }
}
