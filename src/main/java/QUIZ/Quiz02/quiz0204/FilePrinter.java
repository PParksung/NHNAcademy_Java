package QUIZ.Quiz02.quiz0204;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//Quiz 2-4 문제 7
public class FilePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("파일 이름을 입력하세요: ");
        // TODO: 문자열로 파일 이름을 입력 받습니다.
        String fileName = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            // 파일의 내용을 한줄씩 읽어 출력합니다.
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (IOException e) {
            // TODO: 입력된 이름의 파일이 존재하지 않아 예외가 발생한 경우, 메시지를 출력합니다.
            System.out.println("파일을 찾을 수 없습니다: "  + fileName);
        }

        scanner.close();
    }
}
