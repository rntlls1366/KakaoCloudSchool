package ioc02;

class Player {
    private Dice d = null;
    public Player( ){
    }
    public Player(Dice d) {
        this.d = d;
    }

    public void setDice(Dice d){
        this.d = d;
    }

    public void play() {
        for (int i = 0; i < 3; i++) {
            System.out.println(d.getDiceValue());
        }
    }
}

interface Dice {
    public String getDiceValue();
}

class Dice1  implements Dice {
    public String getDiceValue(){return "주사위알고리즘1로 play";}
}

class Dice2   implements Dice  {
    public String  getDiceValue() {   return "2";   }
}