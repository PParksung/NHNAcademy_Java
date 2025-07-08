package QUIZ.Quiz02.quiz0203;

import java.util.Scanner;

//Quiz 2-3 문제 8
public class StringConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        //TODO: 이름을 문자열로 입력 받습니다.
        String name = scanner.nextLine();

        System.out.print("나이를 입력하세요: ");
        //TODO: 나이를 정수로 입력 받습니다.
        int age = scanner.nextInt();

        //TODO: 출력을 위한 문자열을 생성합니다.
        String message = "안녕, " + name + ". 당신의 나이는 " + age + "살입니다." ;
        System.out.println(message);

        //TODO: 내년에 몇살이 되는지 출력합니다.
        // message나 별도의 변수 선언을 하지 않습니다.
        System.out.printf("내년에는 %d살이 되는군요.", (age+1));

        scanner.close();
    }
}
