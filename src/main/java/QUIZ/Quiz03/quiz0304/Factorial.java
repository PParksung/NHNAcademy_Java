package QUIZ.Quiz03.quiz0304;

import java.util.Scanner;

// Quiz 3-4 문제 13
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("정수 입력: ");
        int n = sc.nextInt();
        int result = 1;
        
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        System.out.println("팩토리얼: " + result);
    }
} 