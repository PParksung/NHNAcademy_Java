package QUIZ.Quiz03.quiz0303;

import java.util.Scanner;

// Quiz 3-3 문제 1
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수를 입력하세요 (0을 입력하면 종료): ");
        boolean zero = true;
        int sum = 0;
        int count = 0;
        while(zero == true) {
            int a = sc.nextInt();
            if(a != 0){
                sum += a;
                count++;
            }
            else{
                zero = false;
            }
        }

        System.out.print("평균: " + (double) (sum/count));
    }
}
