package oca.chapter6.throwingsecondexception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    public static void main(String[] args) {
        FileReader reader = null;

        try {
            reader = read();
        } catch (IOException e) {
            System.out.println("ioexception");
            try {
                read();
//                if (reader != null) reader.close();
            } catch (IOException inner) {
                System.out.println("IOEXCEPTION");
            }
        }
    }

    private static FileReader read() throws IOException {
//        throw new IOException();  throw ile yaranan exception hemen scopda tutulmalidir
        // CODE GOES HERE
        return new FileReader("a");
    }


}