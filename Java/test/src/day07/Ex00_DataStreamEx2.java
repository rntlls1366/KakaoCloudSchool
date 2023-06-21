package day07;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex00_DataStreamEx2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("data/data2.bin");
        DataInputStream din = new DataInputStream(fin) ;

        boolean b = din.readBoolean( );
        short s = din.readShort( );
        int i = din.readInt( );
        double d = din.readDouble( );

        System.out.printf(" %s %s %d %f" , b, s, i, d);
        din.close();
    }
}
