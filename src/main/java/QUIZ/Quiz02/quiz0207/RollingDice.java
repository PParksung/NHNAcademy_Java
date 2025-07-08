package QUIZ.Quiz02.quiz0207;

//Quiz 2-7 문제 2
public class RollingDice {
    public static void main(String[] args) {
        int dice1 = (int)(Math.random() * 6) + 1;
        int dice2 = (int)(Math.random() * 6) + 1;
        int sum = dice1 + dice2;
        System.out.println("첫 번째 주사위 결과: " + dice1);
        System.out.println("두 번째 주사위 결과: " + dice2);
        System.out.println("총합: " + sum);
    }
}
