package QUIZ.Quiz03.quiz0306;

import java.util.Scanner;

// Quiz 3-6 문제 12
public class SeasonCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("월 번호를 입력하세요(1~12): ");
        int month = scanner.nextInt();

        if(month < 1 || month > 12) {
            System.out.println("잘못된 입력입니다.");
        } else {
            switch (month) {
                case 3:
                case 4:
                case 5:
                    System.out.println("봄");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("여름");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("가을");
                    break;
                case 12:
                case 1:
                case 2:
                    System.out.println("겨울");
                    break;
            }
        }
    }
} 