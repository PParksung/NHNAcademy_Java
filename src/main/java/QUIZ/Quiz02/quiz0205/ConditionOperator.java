package QUIZ.Quiz02.quiz0205;

import java.util.Scanner;

//Quiz 2-5 문제 6
public class ConditionOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num =  sc.nextInt();

        String result = (num%2==0) ? "짝수" : "홀수";

        System.out.printf("입력한 숫자는 %s입니다.", result);
    }
}
