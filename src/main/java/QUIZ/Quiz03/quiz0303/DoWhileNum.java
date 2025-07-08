package QUIZ.Quiz03.quiz0303;

import java.util.Scanner;

// Quiz 3-3 문제 4
public class DoWhileNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 (0을 입력하면 종료): ");

        int sum = 0;
        int num;
        do{
            num = sc.nextInt();
            sum += num;
        } while (num != 0);

        System.out.print("합: " + sum);
    }
}
