package QUIZ.Quiz02.quiz0207;

import java.util.Scanner;

//Quiz 2-7 문제 5
public class EggCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("계란 개수 입력: ");
        int eggs = sc.nextInt();

        int gross = eggs / 144;
        int remainderAfterGross = eggs % 144;
        int dozen = remainderAfterGross / 12;
        int remainder = remainderAfterGross % 12;

        System.out.printf("당신의 계란 수는 %d gross, %d dozen, %d입니다.\n", gross, dozen, remainder);
    }
}
