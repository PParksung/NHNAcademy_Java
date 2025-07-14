package QUIZ.Quiz05.quiz0508;

// Quiz 5-8 문제 7
public class Main7 {
    public void printUpperCase(String input) {
        // TODO: 로컬 클래스를 정의하고, 대문자로 변환한 문자열을 출력하세요.
        class UpperPrinter {
            public void print(String str) {
                System.out.println(str.toUpperCase());
            }
        }
        UpperPrinter printer = new UpperPrinter();
        printer.print(input);
    }

    public static void main(String[] args) {
        Main7 main = new Main7();
        main.printUpperCase("hello"); // "HELLO" 출력
    }
} 