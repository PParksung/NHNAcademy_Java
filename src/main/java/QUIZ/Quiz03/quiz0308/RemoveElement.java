package QUIZ.Quiz03.quiz0308;

import java.util.Scanner;

// Quiz 3-8 문제 6번
public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int[] numbers = new int[sc.nextInt()];

        System.out.print("배열의 크기만큼 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("배열에서 제거할 값을 입력하세요: ");
        int target = sc.nextInt();

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != target) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != target) {
                result[index] = numbers[i];
                index++;
            }
        }

        System.out.print("결과 값: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
} 