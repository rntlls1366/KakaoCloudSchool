package day07;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex00_DataStreamEx {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("data/data2.bin");
        DataOutputStream dout = new DataOutputStream(fout) ;

        dout.writeBoolean(true);
        dout.writeShort(10);
        dout.writeInt(100);
        dout.writeDouble(10.0);
        dout.close();
    }
}
