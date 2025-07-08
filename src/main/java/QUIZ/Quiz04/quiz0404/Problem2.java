package QUIZ.Quiz04.quiz0404;

import java.util.Scanner;

// Quiz 4-4 문제 2
public class Problem2 {
    public static void main(String[] args) {
        // TODO: nextN 서브루틴을 호출하여 수열 계산하기
        Scanner input = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int n = input.nextInt();
        System.out.print("계산값: "+nextN(n));
    }

    public static int nextN(int currentN) {
        // TODO: currentN에 따라 다음 수를 계산하고 반환
        return currentN *3 + 1;
    }
}