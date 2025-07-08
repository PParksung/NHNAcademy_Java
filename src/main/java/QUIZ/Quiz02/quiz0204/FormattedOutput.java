package QUIZ.Quiz02.quiz0204;

import java.util.Scanner;

//Quiz 2-4 문제 1
public class FormattedOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        // TODO: 정수를 입력 받습니다.
        int num =  scanner.nextInt();

        // TODO: 요구 조건에 맞도록 출력합니다. 10자리, 오른쪽 정렬
        System.out.printf("입력된 숫자는:[ %10d%%]", num);

        scanner.close();
    }
}
