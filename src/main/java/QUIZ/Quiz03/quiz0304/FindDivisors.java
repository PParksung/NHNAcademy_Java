package QUIZ.Quiz03.quiz0304;

import java.util.Scanner;

// Quiz 3-4 문제 5
public class FindDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("정수 입력: ");
        int n = sc.nextInt();
        System.out.print(n + "의 약수: ");
        
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
} 