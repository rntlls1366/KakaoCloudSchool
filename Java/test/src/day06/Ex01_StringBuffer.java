package day06;

public class Ex01_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("문자열 ") ;
        sb1.append("결합") ;
        System.out.println(sb1);//문자열 결합

        StringBuffer sb2 = new StringBuffer("문자열 결합") ;
        System.out.println(sb2);//문자열 결합

        // StringBuffer의 equals 는 내용을 비교하도록 재정의 되어 있지 않음
        System.out.println(sb1.equals(sb2)); //flase


        // StringBuffer의 내용을 String으로 변환한다.
        String s1  = sb1.toString();	// String s = new String(sb);와 같다.
        String s2 = sb2.toString();

        System.out.println("s1.equals(s2) ? " + s1.equals(s2));

   }
}
