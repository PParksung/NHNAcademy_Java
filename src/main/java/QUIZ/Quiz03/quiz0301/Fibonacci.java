package QUIZ.Quiz03.quiz0301;

import java.util.Scanner;

// Quiz 3-1 문제 8
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int n = sc.nextInt();
        fibonacci(n);
    }

    public static void fibonacci(int n){
        int fib [] = new int [n+1];
        fib[0] = 0;
        fib[1] = 1;
        int count = 2;

        while(count != n+1){
            fib[count] = fib[count-1] + fib[count-2];
            count++;
        }

        for(int i=1; i<=n; i++){
            System.out.print(fib[i]+ " ");
        }
    }
}
