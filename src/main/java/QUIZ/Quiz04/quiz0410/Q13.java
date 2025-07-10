package QUIZ.Quiz04.quiz0410;

import java.util.Scanner;

// Quiz 4-10 문제 13
public class Q13 {
    public static double averageN(double[] arr, int n) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum / n;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int num = scanner.nextInt();
        double[] arr = new double[num];

        // 배열 원소 입력
        System.out.print("배열의 원소를 입력하세요:");
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextDouble();
        }

        // 평균을 낼 개수 n 입력
        System.out.print("앞에서 몇 개의 원소 평균을 구할까요? ");
        int n = scanner.nextInt();
        System.out.println(averageN(arr, n));
    }
} 