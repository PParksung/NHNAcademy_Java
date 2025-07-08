package QUIZ.Quiz03.quiz0307;

import java.util.Scanner;

// Quiz 3-7 문제 2
public class IllegalArgumentExceptionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        String input = sc.nextLine();

        try {
            int age = Integer.parseInt(input);
            if(age < 0) {
                throw new IllegalArgumentException("나이는 음수일 수 없습니다.");
            }
            System.out.println("나이: " + age);
        } catch (IllegalArgumentException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }
} 