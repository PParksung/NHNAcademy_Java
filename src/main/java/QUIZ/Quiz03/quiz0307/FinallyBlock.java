package QUIZ.Quiz03.quiz0307;

import java.util.Scanner;

// Quiz 3-7 문제 5
public class FinallyBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("나이를 입력하세요: ");
            int age = sc.nextInt();
            System.out.println("나이: " + age);
        } catch (Exception e) {
            System.out.println("입력 오류가 발생했습니다.");
        }finally {
            if (sc != null) {
                sc.close();
                System.out.println("Scanner 자원을 닫았습니다.");
            }
        }
    }
} 