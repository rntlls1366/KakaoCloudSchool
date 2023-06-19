package lab04;

interface 리모콘 {
    public abstract void on();
    public abstract void off();
}

class 로봇 {
    public void onButtonClick(리모콘 r) {
        r.on();
    }
    public void offButtonClick(리모콘 r) {
        r.off();
    }
}

class TV리모콘 implements 리모콘 {

    @Override
    public void on() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("TV를 끕니다.");
    }
}

class 에어콘리모콘 implements 리모콘 {
    @Override
    public void on() {
        System.out.println("에어콘을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("에어콘을 끕니다.");
    }
}

public class Lab04 {
    public static void main(String[] args) {
        TV리모콘 tr = new TV리모콘();
        에어콘리모콘 ar = new 에어콘리모콘();
        로봇 r = new 로봇();
        r.onButtonClick(tr);
        r.offButtonClick(tr);
        r.onButtonClick(ar);
        r.offButtonClick(ar);
    }
}
