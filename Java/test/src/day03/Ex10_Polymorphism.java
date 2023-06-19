package day03;
class Animal1{
    void move() { System.out.println("동물움직임");}
}
class Lion1 extends Animal1{
    void move() { System.out.println("사자움직임");}
}
class Cat extends Animal1{
    void move() { System.out.println("고양이움직임");}
}
public class Ex10_Polymorphism {
    public static void main(String[] args) {
        Animal1 a =  new Animal1(); a.move(); //동물움직임
        Animal1 b = new Lion1();  b.move(); //사자움직임
        Animal1 c = new Cat();   c.move();//
    }
}
