package QUIZ.Quiz03.quiz0307;

import java.util.Scanner;

// Quiz 3-7 문제 4
public class ExceptionConversion {
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        String input = sc.next();
        
        try {
            int age = Integer.parseInt(input);
            System.out.println("나이: " + age);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("잘못된 나이 형식입니다.");
        }
    }
} 