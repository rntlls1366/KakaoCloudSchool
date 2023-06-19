package day05;

public class Ex08_LocalClassEx {
    String str;

    Ex08_LocalClassEx(String str) {
        this.str = str;
    }

    Runnable getRunnable(final int i) {
//        class Command implements Runnable { //local class
//            public void run() {
//                System.out.println(str + ", " + i);
//                // i변수는 final 지역변수이므로 접근 가능
//            }
//        }
//        return new Command();
        //---------익명 클래스 : 클래스 생성과 동시에 객체 생성하고 리턴. -------
        return new Runnable() {
            public void run() {
                System.out.println(str + ", " + i);
            }
        };
    }
}

interface Runnable {
    public void run();
}
