package QUIZ.Quiz04.quiz0407;

// Quiz 4-7 문제 10
public class Problem10 {

    public static void main(String[] args) {
        int[] numbers = {};

        try {
            // TODO: 배열 유효성 검사
            validateArray(numbers);
            System.out.println("배열이 유효합니다.");
        } catch (IllegalArgumentException e) {
            System.out.println("오류: " + e.getMessage());
        }
    }

    public static void validateArray(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("배열이 비어 있습니다");
        }
    }
} 