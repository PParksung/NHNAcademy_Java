package QUIZ.Quiz04.quiz0404;

import java.util.Scanner;

// Quiz 4-4 문제 8
public class Problem8 {
    public static void main(String[] args) {
        // TODO: findMinMax 서브루틴을 호출하여 배열의 최소값과 최대값을 반환
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기 입력하세요: ");
        int n = sc.nextInt();
        System.out.print("배열을 입력하세요: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("배열의 최솟값: " + findMinMax(arr)[0]);
        System.out.println("배열의 최댓값: " + findMinMax(arr)[1]);
    }

    public static int[] findMinMax(int[] numbers) {
        // TODO: 배열에서 최솟값과 최댓값을 반환하는 로직 구현
        int min = numbers[0];
        int max = numbers[0];
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
            }
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        int [] result = new int[2];
        result[0] = min;
        result[1] = max;
        return result;
    }
}