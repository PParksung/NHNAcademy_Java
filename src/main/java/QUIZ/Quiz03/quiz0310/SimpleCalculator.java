package QUIZ.Quiz03.quiz0310;

import QUIZ.textio.TextIO;

// Quiz 3-10 문제 3번
public class SimpleCalculator {
    public static void main(String[] args) {
        double num1, num2;
        char operator;
        double result;

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요 (종료하려면 0): ");
            num1 = TextIO.getDouble();
            
            if (num1 == 0) {
                break;
            }

            operator = TextIO.getChar();
            num2 = TextIO.getDouble();

            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                result = num1 / num2;
            } else {
                System.out.println("잘못된 연산자입니다.");
                continue;
            }

            System.out.println("결과: " + result);
        }
    }
}