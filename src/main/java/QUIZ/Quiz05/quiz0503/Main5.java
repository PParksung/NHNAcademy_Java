package QUIZ.Quiz05.quiz0503;

import java.util.Date;
import java.util.Random;

// Quiz 5-3 문제 10
public class Main5 {
    public static void main(String[] args) {
        // TODO: Random, Date, StringBuilder를 사용하여 데이터 처리
        Random rand = new Random();
        int num = rand.nextInt(100);
        Date now = new Date();
        StringBuilder sb = new StringBuilder();
        sb.append("Random number: ").append(num).append(", Date: ").append(now);
        System.out.println(sb.toString());
    }
} 