package QUIZ.Quiz03.quiz0308;

import java.util.Scanner;

// Quiz 3-8 문제 5번
public class FindDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int[] numbers = new int[sc.nextInt()];

        System.out.print("배열의 크기만큼 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int check [] = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int index = numbers[i];
            check[index] ++ ; //3이면 index 3에 카운트
        }
        System.out.print("중복된 값: ");

        boolean printed[] = new boolean[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int index = numbers[i];
            if (check[index] > 1 && !printed[index]) {
                System.out.print(numbers[i] + " ");
                printed[index] = true;
            }
        }
    }
} 