package QUIZ.Quiz03.quiz0306;

import java.util.Scanner;

// Quiz 3-6 문제 8
public class PriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("물건 종류(1~3)와 개수를 입력하세요: ");
        int type = scanner.nextInt();
        int count = scanner.nextInt();
        
        int price = 0;
        switch (type) {
            case 1:
                price = 500;
                break;
            case 2:
                price = 1000;
                break;
            case 3:
                price = 2000;
                break;
        }
        
        int total = price * count;
        System.out.println("총 가격: " + total);
    }
} 