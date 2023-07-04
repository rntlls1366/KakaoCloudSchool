package ioc01;

public class Player {
    private Dice d = null;
    public Player(Dice d) {
        this.d = d;
    }

    public void play() {
        System.out.println(d.getDiceValue());
    }
}

interface Dice {
    public String getDiceValue();
}

class Dice1 implements Dice {

    @Override
    public String getDiceValue() {
        return "주사위 알고리즘1로 play";
    }
}

class Dice2 implements Dice {
    @Override
    public String getDiceValue() {
        return "주사위 알고리즘2로 play";
    }
}