package day07;

class Ex1 extends Thread{
    @Override
    public void run(){
        while(true) {
            try {
                Thread.sleep(1000);     //1초 휴식
                System.out.println(getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Ex2 implements Runnable {
    String name;
    Ex2(String name) {
        this.name = name;
    }
    public void run() {
        while(true) {
            try{
                //Thread.sleep(1000);
                System.out.println(this.name);
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class Ex10_Thread {
    public static void main(String[] args) {
//        Ex1 ex1 = new Ex1();
//        Ex1 ex2 = new Ex1();
//
//        ex1.start();
//        ex2.start();

        Ex2 ex3 = new Ex2("Runnable");
        Ex2 ex4 = new Ex2("Runnable2");
        Thread ex33 = new Thread(ex3);
        Thread ex44 = new Thread(ex4);
        ex33.setPriority(10);
        ex33.start();
        ex44.start();
    }
}
