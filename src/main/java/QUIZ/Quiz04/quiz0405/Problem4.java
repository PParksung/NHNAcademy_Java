package QUIZ.Quiz04.quiz0405;

// Quiz 4-5 문제 4
public class Problem4 {
    public static void main(String[] args) {
        // TODO: BiFunction 인터페이스를 사용하여 두 숫자의 합을 반환하는 람다 작성
        java.util.function.BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        // 테스트
        System.out.println("5 + 10 = " + add.apply(5, 10)); // 출력: 15
    }
} 