package QUIZ.Quiz03.quiz0306;

import java.util.Scanner;

// Quiz 3-6 문제 22
public class Quadrant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x와 y 좌표를 입력하세요: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if(x == 0 || y == 0) {
            System.out.println("축 위에 있습니다.");
        } else if(x > 0 && y > 0) {
            System.out.println("1사분면");
        } else if(x < 0 && y > 0) {
            System.out.println("2사분면");
        } else if(x < 0 && y < 0) {
            System.out.println("3사분면");
        } else if(x > 0 && y < 0) {
            System.out.println("4사분면");
        }
    }
} 