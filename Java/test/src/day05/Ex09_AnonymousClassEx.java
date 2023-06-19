package day05;
interface Runnable1
{    public void run(); }
class Ex09_AnonymousClassEx
{    String str;
    Ex09_AnonymousClassEx(String str)
    {   this.str = str;
    }
    Runnable1 getRunnable(final int i)
    {   return new Runnable1()
    {   public void run() {
        System.out.println ( str + ", " + i );
    }
    };   //return 문을 끝내기위해서 `;'가 필요
    }
    // 변수 초기화 수식에서의 익명 클래스
    Runnable1 runner = new Runnable1()
    {   public void run()
    {   System.out.println( str );
    }
    };
    public static void main(String[] args)
    {   Ex09_AnonymousClassEx obj = new Ex09_AnonymousClassEx( "an obj" );
        Runnable1 run1 = obj.getRunnable(1);
        run1.run();
        Runnable1 run2 = obj.getRunnable(2);
        run2.run();
        obj.runner.run();
    }
}
