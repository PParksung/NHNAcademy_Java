package QUIZ.Quiz04.quiz0404;

import java.util.Scanner;

// Quiz 4-4 문제 12
public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int num = sc.nextInt();
        int sq = square(num);
        System.out.println(num + "의 제곱: " + sq);
    }

    public static int square(int num) {
        return num * num;
    }
} 