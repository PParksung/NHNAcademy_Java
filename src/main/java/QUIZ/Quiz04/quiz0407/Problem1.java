package QUIZ.Quiz04.quiz0407;

// Quiz 4-7 문제 1
public class Problem1 {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // TODO: 서브루틴 호출
        double average = calculateAverage(numbers);

        System.out.println("평균: " + average);
    }

    /**
     * 주어진 배열의 평균을 계산합니다.
     * @param array 정수 배열
     * @return 배열의 평균
     * @throws IllegalArgumentException 배열이 비어 있을 때 예외 발생
     */
    public static double calculateAverage(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("배열 빔");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double)sum / array.length;
    }
} 