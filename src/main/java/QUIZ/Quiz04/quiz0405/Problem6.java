package QUIZ.Quiz04.quiz0405;

// Quiz 4-5 문제 6
import java.util.function.Supplier;

public class Problem6 {
    public static void main(String[] args) {
        // TODO: Supplier 인터페이스를 사용하여 랜덤 숫자를 생성하는 람다 작성
        Supplier<Integer> randomNumber = null;

        // 테스트
        System.out.println("랜덤 숫자: " + randomNumber.get());
    }
} 