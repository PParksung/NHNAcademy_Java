package QUIZ.Quiz04.quiz0404;

import java.util.Scanner;

// Quiz 4-4 문제 5
public class Problem5 {
    public static void main(String[] args) {
        // TODO: sumArray 서브루틴을 호출하여 배열의 합을 구하기
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기 입력하세요: ");
        int n = sc.nextInt();
        System.out.print("배열을 입력하세요: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("배열의 합 : " + sumArray(arr));

    }
    public static int sumArray(int[] numbers) {
        // TODO: 배열의 합을 반환
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }
}