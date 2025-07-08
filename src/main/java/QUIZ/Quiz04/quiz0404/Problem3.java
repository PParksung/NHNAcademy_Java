package QUIZ.Quiz04.quiz0404;

import java.util.Scanner;

// Quiz 4-4 문제 3
public class Problem3 {
    public static void main(String[] args) {
        // TODO: checkEvenOdd 서브루틴 호출하여 짝수/홀수 확인하기
        Scanner input = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int n = input.nextInt();
        System.out.print(checkEvenOdd(n) +"입니다");
    }

    public static String checkEvenOdd(int number) {
        // TODO: 숫자가 짝수인지 홀수인지 반환
        if (number % 2 == 0) {
            return "짝수";
        }else{
            return "홀수";
        }
    }
}