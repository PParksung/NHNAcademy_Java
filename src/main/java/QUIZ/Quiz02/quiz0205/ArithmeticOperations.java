package QUIZ.Quiz02.quiz0205;

import java.util.Scanner;

//Quiz 2-5 문제 1
public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("첫 번째 정수를 입력하세요: ");
        // TODO: 첫 번째 정수를 입력 받습니다.
            int first = scanner.nextInt();
            System.out.print("두 번째 정수를 입력하세요: ");
        // TODO: 두 번째 정수를 입력 받습니다.
            int second = scanner.nextInt();

        // TODO : 입력된 두 정수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산 결과를 출력합니다.
            System.out.println("덧셈 결과: " + (first + second));
            System.out.println("뺄셈 결과: " + (first - second));
            System.out.println("곱셈 결과: " + (first * second));
            System.out.println("나눗셈 결과: " + (first / second));
            System.out.println("나머지 연산 결과: " + (first % second));
        }catch(Exception e){
            System.out.println("올바르지 않은 정수가 입력되었습니다: " + e.getMessage());
        }
        scanner.close();
    }
}
