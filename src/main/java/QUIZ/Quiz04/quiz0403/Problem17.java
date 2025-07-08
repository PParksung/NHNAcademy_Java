package QUIZ.Quiz04.quiz0403;

import java.util.Scanner;

// Quiz 4-3 문제 17
public class Problem17 {
    /**
     * 배열에서 N 번째로 큰 값을 반환합니다.
     * @param list 정수 배열
     * @return N 번째로 큰 값
     */
    public static int findNthLargest(int[] list, int n) {
        // TODO: 배열에서 N 번째로 큰 값 찾기
        for(int  i=0; i<list.length-1; i++){ // 반복횟수
            for(int j=0; j<list.length-i-1; j++){ // 비교 횟수
                if(list[j] < list[j+1]){
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
        //for(int i=0; i<list.length; i++){
        //    System.out.print(list[i]+" ");
        //}
        int result = list[0];
        for(int i=0; i<list.length; i++){
            if(i == n){
                result =  list[i];
            }
        }
        return result ; // TODO: N 번째로 큰 값 반환
    }

    public static void main(String[] args) {
        // TODO: 배열을 입력 받으세요.
        System.out.print("배열의 크기를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        System.out.print("배열 요소를 입력하세요: ");
        for(int i=0; i<n; i++){
            list[i] = sc.nextInt();
        }
        // TODO: 몇번째 큰수를 찾을지 입력하세요.
        while(true) {
            System.out.print("순번을 입력하세요: ");
            int order = sc.nextInt();
            if(order == 0){
                break;
            }
            System.out.printf("%d번째 요소 : %d\n", order, findNthLargest(list, order-1));
        }
        // TODO: 0이 입력될때까지 반복하세요.
    }
} 