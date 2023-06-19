package day04;

class Person {
    String name;
    Person(String name) {
        this.name = name;
    }

    public String toString() {

        return this.name;
    }

}
public class Ex11 {
    public static void main(String[] args) {
        Person p = new Person("KJY");
        System.out.println(p.toString());
    }
}
