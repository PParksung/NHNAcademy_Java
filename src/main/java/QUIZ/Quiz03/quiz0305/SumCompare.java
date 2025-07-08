package QUIZ.Quiz03.quiz0305;

import java.util.Scanner;

// Quiz 3-5 문제 19
public class SumCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = a + b;
        System.out.println("합: " + sum);
        
        if(sum >= 100) {
            System.out.println("100 이상입니다.");
        } else {
            System.out.println("100 미만입니다.");
        }
    }
} 