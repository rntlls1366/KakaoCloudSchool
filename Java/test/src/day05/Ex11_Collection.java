package day05;

import java.util.ArrayList;

public class Ex11_Collection {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();  //Vector arr = new Vector();
        arr.add(2);   //add(new Integer(2)); 와 동일
        arr.add("test");
        for(int i=0 ; i < arr.size() ; i++){
            System.out.println(arr.get(i));
        }

    }

}
/*

< Collection 인터페이스 >
public boolean add(Object obj) : 컬렉션에 요소를 추가
public boolean add(int index, Object obj):컬렉션에 요소를 index위치에 추가
public void clear() : 해당 컬렉션의 모든 요소들을 제거
public boolean remove(Object obj) : 해당 컬렉션에서 obj와 동일한 객체를 제거
public boolean isEmpty() : 만일 컬렉션이 요소를 담고 있지 않다면 true를 반환
public int size() :현재 컬렉션 내에 저장되어 있는 요소들의 수를 반환
public Iterator iterator():컬렉션 내의 모든 요소들을 방문 위한 반복자를 반환.
< Set 인터페이스 > Collection을 상속받음.    HashSet, TreeSet
저장되는 객체에 순서가 부여되지 않으며 객체의 중복 저장을 허용하지 않음.
< List 인터페이스 > Collection을 상속받음.    ArrayList, Vector, LinkedList. Stack, Queue
저장되는 객체에 일련의 순서가 부여되고 객체의 중복 저장을 허용
< Map 인터페이스 > 키/값 쌍을 저장.   HashMap, TreeMap, Hashtable, Properties
public Object put (Object key, Object value):키와 값을 쌍으로 컬렉션에 추가
public Object get (Object key): 맵에서 매개인자 key객체를 찾아, 그 키의 value 반환
public Object remove (Object key): 맵에서 매개인자 key객체를 찾아 키와 값을 삭제
public boolean containsKey (Object key): 맵에서 매개인자 key객체를 찾아 있으면 true, 없으면 false 반환.
public boolean containsValue (Object value): 맵에서 매개인자 value객체를 찾아 있으면 true, 없으면 false 반환.
public Set keySet() : 키 객체들만 반환.
public Collection values() : 값 객체들만 반환.
public Set entrySet():키와 값 객체 쌍을 Entry라고 부르며, 그 Entry 전체 반환

< Iterator 인터페이스 > 임의의 컬렉션 객체에 저장된 객체를 차례로 방문 및 제거할 수 있게 함.
public boolean hasNext() : 방문해야 할 객체가 있다면 true를 반환.
public Object next() throws NoSuchElementException
: 다음 객체를 반환. 만일 컬렉션의 끝에 도달하면 NoSuchElementException을 던짐.
public void remove() throws UnsupportedOperationException, NoSuchElementException : 마지막으로 방문한 객체를 제거. 이 메소드는 반드시 요소에 대한 방문(next 호출)을 선행해야 함.

 */