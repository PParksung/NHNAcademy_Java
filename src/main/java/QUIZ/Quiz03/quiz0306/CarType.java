package QUIZ.Quiz03.quiz0306;

import java.util.Scanner;

// Quiz 3-6 문제 4
public class CarType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("자동차 번호 4자리를 입력하세요: ");
        int number = scanner.nextInt();

        if(number < 1000 || number > 9999) {
            System.out.println("유효하지 않은 입력입니다.");
        } else {
            int firstDigit = number / 1000;
            switch (firstDigit) {
                case 1:
                    System.out.println("승용차");
                    break;
                case 2:
                    System.out.println("승합차");
                    break;
                case 3:
                    System.out.println("화물차");
                    break;
                case 4:
                    System.out.println("특수차");
                    break;
                default:
                    System.out.println("알 수 없는 차종입니다.");
            }
        }
    }
} 