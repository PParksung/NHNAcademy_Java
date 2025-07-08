package QUIZ.Quiz03.quiz0304;

import java.util.Scanner;

// Quiz 3-4 문제 14
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("정수 입력: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        
        if(n <= 1){
            isPrime = false;
        } else {
            for(int i = 2; i < n; i++){
                if(n % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        
        if(isPrime){
            System.out.println("소수입니다.");
        } else {
            System.out.println("소수가 아닙니다.");
        }
    }
} 