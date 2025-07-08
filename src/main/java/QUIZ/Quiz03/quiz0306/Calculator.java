package QUIZ.Quiz03.quiz0306;

import java.util.Scanner;

// Quiz 3-6 문제 13
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 수와 연산자를 입력하세요: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        String operator = scanner.next();

        switch (operator) {
            case "+":
                System.out.println("결과: " + (num1 + num2));
                break;
            case "-":
                System.out.println("결과: " + (num1 - num2));
                break;
            case "*":
                System.out.println("결과: " + (num1 * num2));
                break;
            case "/":
                if(num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                } else {
                    System.out.println("결과: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
        }
    }
} 