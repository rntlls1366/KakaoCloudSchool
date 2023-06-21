package day07;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex04_HashMapEx {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        String name = "김선영";
        hm.put(name, 100);
        hm.put("박철수", 90);
        System.out.println(hm.get(name));

        Set keys = hm.keySet();    //키는 중복이 없기에 Set으로
        Collection values = hm.values();
        Set entries = hm.entrySet();   //키값 쌍을 모두 꺼냄

        visitAll(keys);
        visitAll(values);
        visitAll(entries);
    }

    public static void visitAll(Collection ccc) {
        Iterator iii = ccc.iterator();
        while (iii.hasNext()) {
            System.out.println(iii.next());
        }
    }

}
