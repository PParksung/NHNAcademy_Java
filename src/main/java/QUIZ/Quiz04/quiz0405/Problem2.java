package QUIZ.Quiz04.quiz0405;

// Quiz 4-5 문제 2
public class Problem2 {
    public static void main(String[] args) {
        // TODO: Function 인터페이스를 사용하여 문자열 길이를 반환하는 람다 작성
        java.util.function.Function<String, Integer> stringLength = null;

        // 테스트
        System.out.println("문자열 길이: " + stringLength.apply("Hello Lambda")); // 출력: 13
    }
} 