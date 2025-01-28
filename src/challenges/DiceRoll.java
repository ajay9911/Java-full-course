package challenges;

public class DiceRoll {
    int roll(){
        double random=Math.random()*6;
        return (int)Math.ceil(random);
    }
    public static void main(String[] args) {
        DiceRoll diceRoll=new DiceRoll();
        diceRoll.roll();
        for (int i=0;i<20;i++){
            System.out.println(diceRoll.roll());
        }

    }
}
