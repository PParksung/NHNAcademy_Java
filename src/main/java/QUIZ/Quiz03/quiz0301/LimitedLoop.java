package QUIZ.Quiz03.quiz0301;

import java.util.Scanner;

// Quiz 3-1 문제 11
public class LimitedLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        while(n > 0){
            System.out.print("정수를 입력하세요: ");
            n = sc.nextInt();
            if(n>0) {
                System.out.printf("%d의 제곱: %.0f%n", n, Math.pow(n, 2));
            }
        }
        System.out.print("루프 종료");
    }
}
