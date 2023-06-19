package day05;


class Nesting   // 외부 클래스
{   private int i = 1;
    private static int si = 2;
    static class Nested   // static inner class
    {   int j = 3;
        private static int k = 4;
        void print()
        {//외부클래스의 인스턴스 변수 접근 못함
            //System.out.println( i ); //오류
            System.out.println( si );
            System.out.println( j );
        }
    }
    Nesting()
    {  System.out.println( Nested.k );
    }
}

class Ex06
{
    public static void main(String[] args)
    {
        Nesting.Nested n = new Nesting.Nested();//외부클래스명.내부클래스명
        System.out.println( n.j );
    }
} //외부 클래스의 객체없이 static inner 클래스의 객체 생성가능
