package QUIZ.Quiz04.quiz0404;

import java.util.Scanner;

// Quiz 4-4 문제 14
public class Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("최소값을 입력하세요: ");
        int min = sc.nextInt();
        System.out.print("최대값을 입력하세요: ");
        int max = sc.nextInt();
        int rand = getRandomNumber(min, max);
        System.out.println(min + "부터 " + max + "까지 랜덤 숫자: " + rand);
    }

    public static int getRandomNumber(int min, int max) {
        // (min ~ max) 범위의 랜덤 정수 반환
        int result = (int)(Math.random() * (max - min + 1)) + min;
        return result;
    }
} 