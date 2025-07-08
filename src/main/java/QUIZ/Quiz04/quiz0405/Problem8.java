package QUIZ.Quiz04.quiz0405;

// Quiz 4-5 문제 8
@FunctionalInterface
interface MaxFinder {
    int findMax(int a, int b);
}

public class Problem8 {
    public static void main(String[] args) {
        // TODO: MaxFinder 인터페이스를 구현하는 람다 작성
        MaxFinder maxFinder = (a, b) -> a > b ? a : b;

        // 테스트
        System.out.println("큰 값: " + maxFinder.findMax(5, 10)); // 출력: 10
    }
} 