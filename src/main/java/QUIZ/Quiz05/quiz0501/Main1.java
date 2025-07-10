package QUIZ.Quiz05.quiz0501;

// Quiz 5-1 문제 10
public class Main1 {
    public static void main(String[] args) {
        // TODO: int 배열 생성 및 참조 공유
        int[] arr = {1,2,3};
        // TODO: 데이터 수정 및 두 배열의 내용 출력
        int[] reference = arr;

        reference[0] = 10;
        System.out.print("Original Array: ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.print("Reference Array: ");
        for (int n : reference) {
            System.out.print(n + " ");
        }

    }
} 