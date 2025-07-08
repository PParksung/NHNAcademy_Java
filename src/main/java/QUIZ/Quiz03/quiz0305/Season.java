package QUIZ.Quiz03.quiz0305;

import java.util.Scanner;

// Quiz 3-5 문제 6
public class Season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("월을 입력하세요 (1~12): ");
        int month = sc.nextInt();
        
        if(month >= 3 && month <= 5) {
            System.out.println("계절: 봄");
        } else if(month >= 6 && month <= 8) {
            System.out.println("계절: 여름");
        } else if(month >= 9 && month <= 11) {
            System.out.println("계절: 가을");
        } else {
            System.out.println("계절: 겨울");
        }
    }
} 