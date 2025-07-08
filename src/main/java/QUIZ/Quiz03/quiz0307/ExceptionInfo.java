package QUIZ.Quiz03.quiz0307;

import java.util.Scanner;

// Quiz 3-7 문제 6
public class ExceptionInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        try {
            if(age < 0) {
                throw new IllegalArgumentException("입력된 나이 " + age + "는 음수입니다.");
            }
            System.out.println("나이: " + age);
        } catch (IllegalArgumentException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }
} 