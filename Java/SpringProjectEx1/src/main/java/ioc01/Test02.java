package ioc01;

public class Test02 {
    public static void main(String[] args) {
        Player p = new Player(new Dice1());
        p.play();
    }
}
