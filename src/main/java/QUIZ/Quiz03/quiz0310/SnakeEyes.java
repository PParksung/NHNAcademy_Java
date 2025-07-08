package QUIZ.Quiz03.quiz0310;

// Quiz 3-10 문제 1번
public class SnakeEyes {
    public static void main(String[] args) {
        int count = 0;
        int dice1, dice2;

        do {
            dice1 = (int)(Math.random() * 6) + 1;
            dice2 = (int)(Math.random() * 6) + 1;
            count = count + 1;
        } while (dice1 != 1 || dice2 != 1);

        System.out.println("Snake eyes가 나올 때까지 주사위를 " + count + "번 굴렸습니다.");
    }
} 