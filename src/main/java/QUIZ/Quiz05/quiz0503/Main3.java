package QUIZ.Quiz05.quiz0503;

import java.util.Random;

// Quiz 5-3 문제 3
public class Main3 {
    public static void main(String[] args) {
        // TODO: Random 객체 생성 및 난수 생성
        Random rand = new Random();
        int randomNum = rand.nextInt(10) + 1;
        System.out.println(randomNum);
    }
} 