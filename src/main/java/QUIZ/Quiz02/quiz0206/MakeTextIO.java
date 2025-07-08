package QUIZ.Quiz02.quiz0206;

// Quiz 2-6 문제 3-1
import QUIZ.textio.TextIO;

public class MakeTextIO {
    public static void main(String[] args) {
        System.out.print("이름을 입력하세요: ");
        String name = TextIO.getln();

        System.out.print("나이를 입력하세요: ");
        int age = TextIO.getlnInt();

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }
}
