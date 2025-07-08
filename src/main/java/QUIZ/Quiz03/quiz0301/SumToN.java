package QUIZ.Quiz03.quiz0301;

import java.util.Scanner;

// Quiz 3-1 문제 3
public class SumToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int N = sc.nextInt();
        int count = 1;
        int sum = 0;

        while(count  <= N){
            sum += count;
            count++;
        }
        System.out.println(sum);
    }
}
