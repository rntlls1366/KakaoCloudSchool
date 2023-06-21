package day07;

import java.util.Comparator;
import java.util.TreeSet;

public class Ex08_TreeSetEx2 {
    public static void main(String[] args)
    {
//        TreeSet ts = new TreeSet(new Comp());
//        A2 aaa1 = new A2();  aaa1.i= 10; aaa1.j= 100;
//        A2 aaa2 = new A2();  aaa2.i= 100; aaa2.j= 10;
//        ts.add(aaa1); ts.add(aaa2);
    }
}
class A2
{	int i;
    int j;
}
class Comp implements Comparator
{
    @Override
    public int compare(Object o1, Object o2) {

        return ((A2)o1).i - ((A2)o2).i;
    }
}


