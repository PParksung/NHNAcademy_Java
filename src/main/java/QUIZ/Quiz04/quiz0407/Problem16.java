package QUIZ.Quiz04.quiz0407;

// Quiz 4-7 문제 16
public class Problem16 {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 8, 25, 30};
        int threshold = 15;

        // TODO: 서브루틴 호출
        int[] filtered = filterGreaterThan(numbers, threshold);

        // 결과 출력
        System.out.print("필터링된 값: ");
        for (int value : filtered) {
            System.out.print(value + " ");
        }
    }

    public static int[] filterGreaterThan(int[] array, int threshold) {
        // TODO: 기준값보다 큰 숫자들로 새 배열 생성
        return null; // 임시 반환값
    }
} 