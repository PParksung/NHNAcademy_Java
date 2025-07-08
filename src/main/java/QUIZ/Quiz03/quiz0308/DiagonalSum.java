package QUIZ.Quiz03.quiz0308;

import java.util.Scanner;

// Quiz 3-8 문제 10번
public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("2차원 배열의 크기를 입력하세요: ");
        int size = sc.nextInt();

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + "번째 행의 정수를 입력하세요: ");
            for (int j = 0; j < size; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(i  == j) {
                    sum1 += matrix[i][j];
                }
                if(i+j == size -1) { // 4,0 3,1 2,2 1,3 0,4
                    sum2 += matrix[i][j];
                }
            }
        }

        System.out.println("주 대각선의 합: "  + sum1);
        System.out.println("부 대각선의 합: "  + sum2);
    }
} 