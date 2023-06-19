package day03;
// SuperClass 는 하나만. 다중상속 안됨. 
// Permanent is a Employee.  
class Employee{ 
     int id; 
     void print() { System.out.println(id);}
}
class Member { }  // Member is a Employee. ???
// 회원 클래스에서 Employee를 상속받아도 될까??

// SubClass extends SuperClass { }
class Permanent extends Employee{
}
public class Ex07_InheritanceEx {
    public static void main(String[] args) {
        Permanent p = new Permanent(); p.print();
    }
}
