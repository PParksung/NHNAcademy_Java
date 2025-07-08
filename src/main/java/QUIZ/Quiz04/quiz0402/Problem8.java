package QUIZ.Quiz04.quiz0402;

import java.util.Scanner;

// Quiz 4-2 문제 8
public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수의 갯수를 입력하세요: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("정수를 입력하세요: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = sumArray(arr);
        System.out.println("합: " + sum);
    }

    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
} 