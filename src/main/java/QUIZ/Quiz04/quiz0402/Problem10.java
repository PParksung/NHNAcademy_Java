package QUIZ.Quiz04.quiz0402;

import java.util.Scanner;

// Quiz 4-2 문제 10
public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();
        try {
            validateAge(age);
            System.out.println("나이는 " + age + "세입니다.");
        } catch (IllegalArgumentException e) {
            System.out.println("나이가 잘못 입력되었습니다.");
        }
    }

    public static void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException();
        }
    }
} 