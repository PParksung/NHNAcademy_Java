package QUIZ.Quiz05.quiz0509;

// 5.1 연습문제
public class PairOfDice1 {
    // TODO: die1, die2를 private으로 선언하고, getter와 toString()을 구현하세요.
    private int die1;
    private int die2;

    public PairOfDice1() {
        roll();
    }

    public void roll() {
        die1 = (int)(Math.random() * 6) + 1;
        die2 = (int)(Math.random() * 6) + 1;
    }

    public int getDie1() {
        return die1;
    }
    public int getDie2() {
        return die2;
    }
    public String toString() {
        return "Die1: " + die1 + ", Die2: " + die2;
    }

    public static void main(String[] args) {
        PairOfDice1 dice = new PairOfDice1();
        int count = 0;

        dice.roll();
        while (dice.getDie1() + dice.getDie2() != 2) {
            dice.roll();
            count++;
        }
        count++;

        System.out.println("두 주사위의 합이 2가 될 때까지 굴린 횟수: " + count);
        System.out.println(dice);
    }
}