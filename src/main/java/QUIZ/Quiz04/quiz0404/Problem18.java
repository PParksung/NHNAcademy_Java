package QUIZ.Quiz04.quiz0404;

import java.util.Scanner;

// Quiz 4-4 문제 18
public class Problem18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("배열의 요소를 입력하세요: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = findMax(arr);
        System.out.println("최대값: " + max);
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
} 