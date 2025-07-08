package QUIZ.Quiz04.quiz0404;

import java.util.Scanner;

// Quiz 4-4 문제 20
public class Problem20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("배열의 요소를 입력하세요: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        double avg = averageValue(arr);
        System.out.println("평균값: " + avg);
    }

    public static double averageValue(int[] numbers) {
        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return (double)sum / numbers.length;
    }
} 