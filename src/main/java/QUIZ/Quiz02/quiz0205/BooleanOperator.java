package QUIZ.Quiz02.quiz0205;

import java.util.Scanner;

//Quiz 2-5 문제 5
public class BooleanOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요: ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        int second = sc.nextInt();

        System.out.println("두 값이 모두 양수인가? " + (first > 0 && second > 0));
        System.out.println("두 값 중 하나라도 양수인가? " + (first > 0 || second > 0));
    }
}