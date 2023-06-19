package day02;

public class Ex08ArrayEx1 {
    public static void main(String[] args) {
    //  1.배열 변수 선언 (모든 배열 변수는 reference type) 
	    int[ ] data ;   // or   int data[ ] ;  
        String[] str;      
	// 2.  배열 객체 할당 (Heap 메모리 생성)
	    data = new int[ 3 ] ;  //자동초기화  
        str = new String[2] ;    
	// 3. 값 할당 
	    data[0] = 10;  
        str[0] ="aaa";   
	// 1, 2, 3. 동시에 
	    int[] data1 = {1,2,3} ;
	// 2,3 동시에  
	//  data1 = {1,2,3}; // 오류 
	    data1 = new int[] { 1,2,3 };  //ok

        for( int i : data1 ){
            System.out.println(i);
        }
         

    //  1. 2차원 배열변수선언 
     int[ ][ ] data2D ;  //or.  int data2D [ ][ ]  // or    int[ ]  data2D[ ]  

   // 2. 배열 객체 할당 . 
    data2D = new int[2][3] ;   // 직사각형 2행 3열 배열 

    data2D = new int[2][] ;   //지그재그 배열. 
    data2D[0] = new int[3]; 
    data2D[1] = new int[2];

    }
   

}
