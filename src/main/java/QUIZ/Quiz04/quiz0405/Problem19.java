package QUIZ.Quiz04.quiz0405;

// Quiz 4-5 문제 19
import java.util.function.Consumer;

public class Problem19 {
    public static void main(String[] args) {
        int number = -5;

        // TODO: Consumer를 사용하여 조건부 처리 람다 작성
        Consumer<Integer> processor = n -> {
            if(n > 0) {
                System.out.println(n);
            } else {
                System.out.println("음수는 처리되지 않습니다.");
            }
        };

        // 처리 실행
        processor.accept(number);
    }
} 