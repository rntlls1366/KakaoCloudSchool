package day07;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex07_TreeSetEx1 {
    public static void main(String[] args)
    {	TreeSet ts = new TreeSet();
        A1 aaa1 = new A1();  aaa1.i= 10; aaa1.j= 100;
        A1 aaa2 = new A1();  aaa2.i= 100; aaa2.j= 10;
        ts.add(aaa1); ts.add(aaa2);
    }

    public static void show(TreeSet ts) {
        Iterator it = ts.iterator();
        while(it.hasNext()) {
            System.out.println();
        }
    }
}
class A1 implements Comparable
{	int i;
    int j;

    @Override
    public int compareTo(Object o) {
        if(o instanceof A1) {
            A1 a = (A1)o;
            return this.i - a.i;
        }
        return 0;
    }
};


