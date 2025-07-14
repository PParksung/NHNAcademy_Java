package QUIZ.Quiz05.quiz0508;

// Quiz 5-8 문제 16
public class Main16 {
    public int addNumbers(int a, int b) {
        // TODO: 로컬 클래스를 정의하고 두 수의 합을 반환하세요.
        class Adder {
            public int add(int x, int y) {
                return x + y;
            }
        }
        Adder adder = new Adder();
        return adder.add(a, b);
    }

    public static void main(String[] args) {
        Main16 main = new Main16();
        System.out.println(main.addNumbers(3, 7)); // 10 출력
    }
} 