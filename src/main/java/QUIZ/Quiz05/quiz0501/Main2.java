package QUIZ.Quiz05.quiz0501;

// Quiz 5-1 문제 16
public class Main2 {
    public static void main(String[] args) {
        // TODO: int 배열 생성 및 참조 공유
        int[] original = {10, 99, 30};
        // TODO: 데이터 수정 및 두 배열의 내용 출력
        int[] reference = original;

        System.out.print("Original Array: ");
        for (int num : original) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.print("Shared Array: ");
        for (int num : reference) {
            System.out.print(num + " ");
        }

    }
} 