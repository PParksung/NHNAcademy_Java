package QUIZ.Quiz03.quiz0301;

import java.util.Scanner;

// Quiz 3-1 문제 14
public class ValidNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valid = true;
        int a = 0;
        while(valid == true) {
            System.out.print("1에서 100 사이의 숫자를 입력하세요: ");
            a = sc.nextInt();
            if( a >= 1 && a <= 100){
                valid = false;
            }
        }
        System.out.print("유효한 입력: " + a);

    }
}
