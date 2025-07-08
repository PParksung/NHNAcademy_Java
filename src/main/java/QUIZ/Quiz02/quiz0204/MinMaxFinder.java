package QUIZ.Quiz02.quiz0204;

import java.util.Scanner;

//Quiz 2-4 문제 9
public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("실수 배열을 입력하세요 (공백으로 구분): ");
        String input = scanner.nextLine();

        // TODO: 공백을 기준으로 문자열을 분리합니다.
        //input = input.replaceAll("\\s+", " ");
        String[] parts = input.trim().split("\\s+");

        // 분리된 문자열 갯수만큼의 숫자 배열을 생성합니다.
        double[] numbers = new double[parts.length];

        for (int i = 0; i < parts.length; i++) {
            // TODO: 문자열을 실수로 변환합니다.
            numbers[i] = Double.parseDouble(parts[i]);
        }

        // TODO: 숫자들중 최소값과 최대값을 구합니다.
        double min = numbers[0];
        double max = numbers[0];

        for (int i = 1; i < parts.length; i++) {
            if (numbers[i] < min){
                min = numbers[i];
            }
            if (numbers[i] > max){
                max = numbers[i];
            }
        }

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);

        scanner.close();
    }
}
