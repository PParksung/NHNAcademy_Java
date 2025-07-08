package QUIZ.Quiz03.quiz0303;

import java.util.Scanner;

// Quiz 3-3 문제 12
public class DoWhileInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        do {
            System.out.print("1에서 10 사이의 숫자를 입력하세요: ");
            num = sc.nextInt();
        } while(num < 1 || num > 10);
        
        System.out.println("유효한 입력: " + num);
    }
} 