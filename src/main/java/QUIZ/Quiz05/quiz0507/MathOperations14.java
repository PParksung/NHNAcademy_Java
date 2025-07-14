package QUIZ.Quiz05.quiz0507;

// Quiz 5-7 문제 14: 정적 메서드 정의
public interface MathOperations14 {
    static int square(int x) {
        // TODO: 정수의 제곱을 반환하세요.
        return x * x;
    }
}

class Main14 {
    public static void main(String[] args) {
        System.out.println(MathOperations14.square(5)); // 25 출력
    }
} 