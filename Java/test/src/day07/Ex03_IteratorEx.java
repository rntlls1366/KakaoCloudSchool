package day07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Ex03_IteratorEx {
    public static void main(String[] args)
    {
        ArrayList arr = new ArrayList();
        arr.add(new Integer(1));
        arr.add(new Float(2.0f));
        for(int i=0 ; i < arr.size() ; i++){
            System.out.println(arr.get(i));
        }


        HashSet hs = new HashSet();
        A aaa = new A(); aaa.i = 10 ;
        hs.add(aaa);
        hs.add(aaa);

        System.out.println(" ArrayList") ;
        visitAll(arr);

        System.out.println(" HashSet") ;
        visitAll(hs);

    }
    public static void visitAll(Collection ccc)
    {	Iterator iii = ccc.iterator();
        while (iii.hasNext())
        {	System.out.println(iii.next());
        }
    }
}

class A
{  int i;
    public String toString()
    {   return Integer.toString(i);  	}
};

