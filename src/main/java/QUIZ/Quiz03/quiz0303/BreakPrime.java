package QUIZ.Quiz03.quiz0303;

import java.util.Scanner;

// Quiz 3-3 문제 13
public class BreakPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력: ");
        int n = sc.nextInt();
        
        if(n <= 1) {
            System.out.println("소수가 아닙니다");
        } else {
            for(int i = 2; i < n; i++) {
                if(n % i == 0) {
                    System.out.println("소수가 아닙니다");
                    break;
                }
                if(i == n - 1) {
                    System.out.println("소수입니다.");
                }
            }
        }
    }
} 