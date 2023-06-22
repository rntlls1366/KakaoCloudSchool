package day08;

public class Ex04_ThreadWait {

    public static void main(String args[]) {
        Runnable r = new RunnableEx();
        new Thread(r).start();
        new Thread(r).start();
    }
}

class Account {
    private int balance = 1000;
    public  int getBalance() {
        return balance;
    }

    public synchronized void deposit(int money) {
        balance += money;
        notifyAll();
    }

    public synchronized void withdraw(int money){
        while(balance < money) {
            try{
                wait();
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if(balance >= money) {
            try { Thread.sleep(1000);}
            catch(InterruptedException e) {}
            balance -= money;
        }
    }
}

class RunnableEx  implements Runnable {
    Account acc = new Account();

    public void run() {
        while(acc.getBalance() > 0) {
            int money = (int)(Math.random() * 3 + 1) * 100;
            acc.withdraw(money);
            System.out.println("balance:"+acc.getBalance());
        }
    } // run()
}