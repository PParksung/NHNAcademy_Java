package QUIZ.Quiz02.quiz0207;

import java.util.Scanner;

//Quiz 2-7 문제 3
public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name.toUpperCase() + ", nice to meet you!");
    }
}
