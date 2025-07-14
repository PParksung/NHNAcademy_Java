package QUIZ.Quiz05.quiz0508;

// Quiz 5-8 문제 9
public class Calculator9 {
    static int base = 10;

    static class Adder9 {
        // TODO: add 메서드를 작성하여 base 값을 더한 결과를 반환하세요.
        public int add(int x) {
            return x + base;
        }
    }

    public static void main(String[] args) {
        Calculator9.Adder9 adder = new Calculator9.Adder9();
        System.out.println(adder.add(5)); // 15 출력
    }
} 