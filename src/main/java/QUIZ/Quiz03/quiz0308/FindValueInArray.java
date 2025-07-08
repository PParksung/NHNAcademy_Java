package QUIZ.Quiz03.quiz0308;

import java.util.Scanner;

// Quiz 3-8 문제 4번
public class FindValueInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int[] numbers = new int[sc.nextInt()];

        System.out.print("배열의 크기만큼 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("배열에서 찾을 값을 입력하세요: ");
        int target = sc.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println(target + "은 인덱스 " + i + "에 존재합니다.");
            }
        }
    }
} 