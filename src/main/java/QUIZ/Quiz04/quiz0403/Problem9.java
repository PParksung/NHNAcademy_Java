package QUIZ.Quiz04.quiz0403;

// Quiz 4-3 문제 9
public class Problem9 {
    /**
     * 배열을 반대로 뒤집습니다.
     * @param list 정수 배열
     */
    public static void reverseArray(int[] list) {
        // TODO: 배열을 반대로 뒤집기
        int left = 0;
        int right = list.length - 1;
        while (left < right) {
            int temp = list[left];
            list[left] = list[right];
            list[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        reverseArray(numbers);
        for (int number : numbers) {
            System.out.print(number + " "); // 출력: 5 4 3 2 1
        }
    }
} 