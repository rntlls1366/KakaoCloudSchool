package day08;

class Count {
    int i = 0;

    void add() {
        i++;
    }

    void add2() {
        synchronized(this) {
            i++;
        }
    }
}

class Ex implements Runnable {
    Count c = new Count();
    public void run() {
        for(int i = 0; i < 100000; i++) {
            c.add2();
        }
    }
}

public class Ex03_Sync {
    public static void main(String[] args) throws InterruptedException {
        Ex e = new Ex();
        Thread t1 = new Thread(e);
        Thread t2 = new Thread(e);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(e.c.i);
    }
}
