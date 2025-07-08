package QUIZ.Quiz03.quiz0308;

import java.util.Scanner;

// Quiz 3-8 문제 12번
public class StrangeArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열 행의 길이를 입력하세요: ");
        int size = sc.nextInt();

        int[][] array = new int[size][];

        int maxCol = 0;
        for (int i = 0; i < size; i++) {
            System.out.printf("배열의 %d번째 행의 길이를 입력하세요: ", i + 1);
            int length = sc.nextInt();
            array[i] = new int[length];
            if (length > maxCol) {
                maxCol = length;
            }

            System.out.printf("배열의 요소를 입력하세요: ");
            for (int j = 0; j < length; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){

            }
        }

    }
} 