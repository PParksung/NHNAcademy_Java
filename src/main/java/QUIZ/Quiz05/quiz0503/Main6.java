package QUIZ.Quiz05.quiz0503;

import java.util.Random;

// Quiz 5-3 문제 13
public class Main6 {
    public static void main(String[] args) {
        // TODO: Random 객체 생성
        Random rand = new Random();
        // TODO: 배열 초기화 및 출력
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
        }
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
} 