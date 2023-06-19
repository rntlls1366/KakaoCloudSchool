package day02;

import java.util.Arrays; 
import java.util.Collections; 

public class Ex09ArrayEx2 {
    public static void main(String[] args) {
        int data[] = {10,30,201,23,1,3}; 
        Arrays.sort(data) ;
        for ( int i : data ){
            System.out.print(i+" ");
        }
        System.out.println(); // 줄바꿈

        Arrays.binarySearch(data, 0, 4, 10);
        
        Integer data2[] = {10,30,201,23,1,3}; 
        Arrays.sort(data2, Collections.reverseOrder()) ;
        for ( int i : data2 ){
            System.out.print(i+" ");
        }
        System.out.println(); // 줄바꿈

        int x = 11; int y[] = {11};
        change1(x); change2(y); 
        System.out.println(x +" " + y[0]);//11  21
    }

    static void change1(int x ){
        x = x + 10;  
    }
    static void change2(int[] data  ){ //배열은 reference type
        data[0] =  data[0]+10; 
    }
}
