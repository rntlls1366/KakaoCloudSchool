package day07;

import java.io.*;
import java.util.stream.*;

class Ex00_File {
    public static void main(String[] args) {
        File f = new File("data/data1.txt");
        System.out.println(f.getAbsoluteFile());
        System.out.println(f.isFile() );
        // f.deleteOnExit()   ; //파일 존재하면 삭제

        File dir = new File("src/day02/") ;
        if( dir.isDirectory() )
            printFiles(dir) ;

    }
    static void printFiles(File dir){
        if (dir.isDirectory()){
          File[] files =   dir.listFiles();
          for( File f : files ) {
              if(f.isDirectory()) {
                  printFiles(f);
              }
              else {
                  System.out.println(f.getAbsoluteFile());
              }
          }
        }
    }
}