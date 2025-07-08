package QUIZ.Quiz02.quiz0204;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Quiz 2-4 문제 5
public class ProfileWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        // TODO: 이름을 문자열로 입력 받습니다.
        String name = scanner.nextLine();

        // TODO: "나이를 입력하세요: "를 출력하고, 나이를 숫자로 입력 받습니다.
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기

        // TODO: "좋아하는 색을 입력하세요: "를 출력하고, 색을 문자열로 입력 받습니다.
        System.out.print("좋아하는 색을 입력하세요: ");
        String color = scanner.nextLine();

        try (FileWriter writer = new FileWriter("profile.txt")) {
            // TODO: 파일에 입력 받은 내용을 저장합니다.
            writer.write("이름: " + name + "\n");
            writer.write("나이: "  + age + "\n");
            writer.write("좋아하는 색: "  + color + "\n");

            System.out.println("profile.txt에 저장되었습니다.");
        } catch (IOException e) {
            System.out.println("파일 저장 중 오류 발생: " + e.getMessage());
        }

        scanner.close();
    }
}
