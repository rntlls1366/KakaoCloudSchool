package day06;

public class Ex02_Wrapper {
    public static void main(String[] args) {
        // 문자열을 기본형으로
        byte b = Byte.parseByte("10");
        short s = Short.parseShort("10");
        int i = Integer.parseInt("10");
        long l = Long.parseLong("10");
        float f = Float.parseFloat("10.0");
        double d = Double.parseDouble("10.0");
        char c = "a".charAt(0);
        boolean bo = Boolean.parseBoolean("true");

        //기본형을 객체(Wrapper ) 로
        Byte b1 = (Byte) b;
        Byte b3 = b;
        Byte b2 = new Byte(b);

        Short s1 = (Short) s;
        Short s3 = s;
        Short s2 = new Short(s);

        Integer i1 = (Integer) i;
        Integer i3 = i;
        Integer i2 = new Integer(i);

        // 기본형을 문자열로
        String strVal = String.valueOf(i); // int를 String으로 변환한다.

        double dVal = 200.0;
        String strVal2 = dVal + "";    // int를 String으로 변환하는 또 다른 방법


        // 문자열을  Wrapper 클래스 객체로
        Integer iobj1 = Integer.valueOf(strVal);
        Double dobj2 = Double.valueOf(strVal2);

        //
        int iobj2 = Integer.valueOf(strVal);
        double dobj3 = Double.valueOf(strVal2);
    }
}
