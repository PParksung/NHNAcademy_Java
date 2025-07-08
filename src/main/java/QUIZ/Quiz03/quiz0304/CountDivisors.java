package QUIZ.Quiz03.quiz0304;

import java.util.Scanner;

// Quiz 3-4 문제 6
public class CountDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("정수 입력: ");
        int n = sc.nextInt();
        int count = 0;
        
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        System.out.println("약수 개수: " + count);
    }
} 