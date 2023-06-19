package day03;
/*
 * 
 * 자바 문자열은 상수. 
 *     한번 생성되면 변경할 수 없다.  
 * String abc = "aa"; 
 * abc = "bb";  // 가능. 
 * 
 */
public class Ex06_StringEx {
    
    public static void main(String[] args) {
      String s1 = " Test Test ";
      System.out.println("s1's Length : " + s1.length());       //11
      System.out.println("앞뒤 공백 제거 " + s1.trim());       //Test Test
      System.out.println("소문자로 변경" + s1.toLowerCase()); // test test
      System.out.println("소문자로 변경 이후의 s1 : " + s1);   // Test Test 
  
      s1 = s1.toUpperCase();
      System.out.println("대문자로 변경" + s1); 	        // TEST TEST 
      
      String s4 = new String("amit");
      System.out.println("s4의 문자열 대체 : " + s4.replace('m', 'r'));  //arit
      System.out.println("문자열 대체 이후의 s4 : " + s4);             //amit
          
      String str1 = "abc";
      String str2 = "AbC";
          
      //대소문자 구별. 문자열 내용 같으면 true
      System.out.println(str1.equals(str2));                    //false
      //대소문자 구별하지 않고 문자열 내용 같으면 true
      System.out.println(str1.equalsIgnoreCase(str2));          //true
      //같으면 0, 다르면 음수 또는 양수
      System.out.println(str1.compareTo(str2));                //32
  
       String str = "Hello Java";
       // He로 시작하면 true
      System.out.println(str.startsWith("He"));                 //true
      // va로 끝나면 true
      System.out.println(str.endsWith("va"));                  //true
      // 0번 인덱스 문자 하나를 char형으로 반환(자바문자는 0인덱스부터 시작 )
      char ch1 = str.charAt(  0);      //H
      // 1번 인덱스 문자 하나를 char형으로 반환
      char ch2 = str.charAt(1);	   //e  
      System.out.println(ch1 + "" + ch2);   //He
          
      //str 문자열에서 "el" 문자열 찾아서 그 인덱스를 반환. 못 찾으면 -1반환
      System.out.println(str.indexOf("el"));  //1 
      //str 문자열에서 "l" 문자열 찾아서(뒤에서부터) 그 인덱스를 반환. 못 찾으면 -1반환
      System.out.println(str.lastIndexOf("l"));  //3
      //인덱스 1부터 3바로 앞까지 복사.
      String str3 = str.substring(1, 3); //el
      //인덱스 1부터 끝까지 복사.		
      String str4 = str.substring(1);   //ello Java 
      System.out.println(str3);       // el
      System.out.println(str4);       // ello Java 
      //문자열 이어붙이기
      System.out.println(str.concat(str3)); //Hello Javael
      System.out.println(str+ str3);// Hello Javael

      String a = "abc";
      String b = "abc";
      String c = new String("abc") ; 
      System.out.println( a == b ); // true 
      System.out.println( a == c ); // false 
      System.out.println( a.equals(c) ); // true 
      //문자열 비교는 equals로 해야한다. 
      
    }
}
  