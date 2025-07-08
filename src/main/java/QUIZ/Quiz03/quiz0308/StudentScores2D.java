package QUIZ.Quiz03.quiz0308;

import java.util.Scanner;

// Quiz 3-8 문제 11번
public class StudentScores2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.print("배열의 요소를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("회전수를 입력하세요: ");
        int rotate = sc.nextInt();

        if (rotate > 0) {
            for (int i = 0; i < rotate; i++) {
                int last = numbers[numbers.length - 1];
                for (int j = numbers.length - 1; j > 0; j--) {
                    numbers[j] = numbers[j - 1];
                }
                numbers[0] = last;
            }
        } else {
            rotate = -rotate;
            for (int i = 0; i < rotate; i++) {
                int first = numbers[0];
                for (int j = 0; j < numbers.length - 1; j++) {
                    numbers[j] = numbers[j + 1];
                }
                numbers[numbers.length - 1] = first;
            }
        }

        System.out.print("회전 결과: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
} 