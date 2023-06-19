package day03;

class Car{
	String id;
	int speed; 
	static int cnt; 
	public void setSpeed( int speed){ 
		//컴파일 시 setSpeed(Car this, int speed)
        this.speed = speed ; 
        this.cnt = 10; //OK 권장하진 않음.
		Car.cnt = 10; // 권장
	}
	static void setCnt(int cnt){
		//this.cnt = cnt;//static 메소드에서는 this.를 못씁니다.
		Car.cnt = cnt;
	}
	//this 없는 speed는 매개인자 
	//this.speed는 인스턴스변수
}
public class Ex01_thisEx {
	public static void main(String[] args) {
		 
	}
}
