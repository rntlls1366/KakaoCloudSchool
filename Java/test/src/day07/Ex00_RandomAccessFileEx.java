package day07;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Ex00_RandomAccessFileEx {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf=new RandomAccessFile("raf_file.dat","rw");
        System.out.println("position:" + raf.getFilePointer());

        raf.writeInt(10);
        System.out.println("position:" + raf.getFilePointer());	//4bytes

        raf.writeChar('C');
        System.out.println("position:" + raf.getFilePointer());	//2bytes

        raf.writeLong(1010L);
        System.out.println("position:" + raf.getFilePointer());	//8bytes

        raf.writeByte(8);
        System.out.println("position:" + raf.getFilePointer());	//1byte

        raf.seek(0);    //위치 옮기기

        System.out.println(raf.readInt());
        System.out.println(raf.readChar());
        System.out.println(raf.readLong());
        System.out.println(raf.readByte());

        raf.close();
    }
}
