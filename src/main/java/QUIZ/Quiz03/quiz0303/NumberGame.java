package QUIZ.Quiz03.quiz0303;

import java.util.Scanner;

// Quiz 3-3 문제 9
public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = (int)(Math.random() * 100) + 1;
        System.out.println("1부터 100 사이의 숫자를 맞춰보세요!");
        
        while(true) {
            System.out.print("숫자 입력: ");
            int guess = sc.nextInt();
            if(guess == target) {
                break;
            } else if(guess < target) {
                System.out.println("더 큰 숫자를 입력하세요.");
            } else {
                System.out.println("더 작은 숫자를 입력하세요.");
            }
        }
    }
} 