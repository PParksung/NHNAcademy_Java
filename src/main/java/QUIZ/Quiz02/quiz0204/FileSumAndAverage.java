package QUIZ.Quiz02.quiz0204;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//Quiz 2-4 문제 6
public class FileSumAndAverage {
    public static void main(String[] args) {
        try (Scanner fileScanner = new Scanner(new File("numbers.txt"))) {
            int sum = 0;
            int count = 0;

            while (fileScanner.hasNextInt()) {
                // TODO: 읽을 수 있는 숫자가 있으므로, 숫자를 읽어 더합니다.
                sum += fileScanner.nextInt();
                count++;
            }

            System.out.println("합: " + sum);
            if (count > 0) {
                // TODO: numbers.txt에 숫자가 1개 이상인 경우, 평균을 계산하여 출력합니다.
                double average = (double) sum / count;
                System.out.println("평균: " + average);
            } else {
                System.out.println("평균: 계산할 수 없음 (숫자가 없습니다).");
            }

        } catch (IOException e) {
            // 파일이 존재하지 않거나, 파일에서 데이터를 읽어 오는데 문제가 있을 경우, 예외가 발생됩니다.
            System.out.println("파일 읽기 오류: " + e.getMessage());
        }
    }
}
