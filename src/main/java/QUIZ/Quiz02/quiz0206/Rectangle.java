package QUIZ.Quiz02.quiz0206;

// Quiz 2-6 문제 6
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요: ");
        int height = sc.nextInt();

        System.out.print("두 번째 정수를 입력하세요: ");
        int width = sc.nextInt();

        System.out.println("넒이 : " + height * width);
    }
}
