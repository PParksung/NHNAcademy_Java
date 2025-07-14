package QUIZ.Quiz05.quiz0509;

// Quiz 5-9 문제 3
public class DiceRollStats3 {
    public static void main(String[] args) {
        for (int sum = 2; sum <= 12; sum++) {
            StatCalc2 stats = new StatCalc2();
            int maxRolls = 0;
            for (int i = 0; i < 10000; i++) {
                PairOfDice1 dice = new PairOfDice1();
                int rolls = 1;
                dice.roll();
                while (dice.getDie1() + dice.getDie2() != sum) {
                    dice.roll();
                    rolls++;
                }
                stats.enter(rolls);
                if (rolls > maxRolls) maxRolls = rolls;
            }
            System.out.printf("합 %2d: 평균=%.2f, 표준편차=%.2f, 최대 롤 횟수=%d\n",
                sum, stats.getMean(), stats.getStandardDeviation(), maxRolls);
        }
    }
} 