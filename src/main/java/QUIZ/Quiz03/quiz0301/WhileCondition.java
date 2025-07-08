package QUIZ.Quiz03.quiz0301;

import java.util.Scanner;

// Quiz 3-1 문제 4
public class WhileCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int a = 1;
        System.out.print("정수를 입력하세요: ");
        while (a != 0) {
            a = sc.nextInt();
            if(a>0) sum += a;
        }
        System.out.println("합: " + sum);
    }
}
