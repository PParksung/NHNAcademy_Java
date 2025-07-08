package QUIZ.Quiz02.quiz0205;

import java.util.Scanner;

//Quiz 2-5 문제 2
public class DivisionResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요: ");
        // TODO: 첫 번째 정수를 입력 받습니다.
        int first = scanner.nextInt();

        System.out.print("두 번째 정수를 입력하세요: ");

        int second = scanner.nextInt();

        try {
            // TODO: 두 정수간 나누셈을 출력합니다.
            int division1 = first / second;
            System.out.println("정수 나눗셈 결과: " + division1);

            // TODO: 정수를 실수로 변환하여 나누셈을 출력합니다.
            double division2 = ((double) first / second);
            System.out.println("실수 나눗셈 결과: " + division2);
        } catch (Exception e) {
            System.out.println("연산에 오류가 발생하였습니다: " + e.getMessage());
        }

        scanner.close();
    }
}
