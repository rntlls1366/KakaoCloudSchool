package day06;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex11_FileWriterPrintWriter {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("data/pw.txt");
        pw.println("aaaaaaa");
        pw.println("aaaaaaa");
        pw.println("aaaaaaa");
        pw.printf( "%10s", "aaaaaaa");
        pw.close();



    }
}
