package day03;
class Animal2{
    void move() { System.out.println("동물움직임");}
}
class Lion2 extends Animal2{
    void move() { System.out.println("사자움직임");}
    void aaa() {}
}
public class EX13_ObjectCasting {
   public static void main(String[] args) {
       Animal a = new Lion();  //Lion is a Animal 
       // 묵시적 upcasting  
       //Lion one = new Animal();  
       //Downcasting 묵시적 안됨.  
       Lion obj2 = (Lion )(new Animal());  
       //컴파일 시 명시적 Downcasting 가능  
       Lion2[] lions = new Lion2 [10]; // Lion2객체만 
       Animal2[] animals = new Animal2[10]; 
       animals[0] = new Lion2(); 
   } 
   static void treat(Animal2 a) {
        a.move(); 
        if (a instanceof Lion2){ // downcasting이 가능한 지 확인
              Lion2 obj =(Lion2)a; 
              obj.aaa();
        }
   }   
}