package QUIZ.Quiz04.quiz0403;

// Quiz 4-3 문제 2
public class Problem2 {
    /**
     * N의 모든 약수를 출력합니다.
     * @param N 양의 정수
     */
    public static int[] getDivisors(int N) {
        // TODO: N이 양수가 아니면 IllegalArgumentException 던지기
        if(N < 0){
            throw new IllegalArgumentException("N은 양수여야함");
        }
        // TODO: N의 모든 약수를 배열로 반환

        int count = 0;
        for(int i=1; i<=N; i++){
            if(N % i == 0){
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for(int i = 1; i <= N; i++){
            if(N % i == 0){
                result[index] = i;
                index++;
                //System.out.print(result[index] + " ");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 28; // 테스트할 숫자
        // TODO: 결과 출력
        int[] divisors = getDivisors(number);
        System.out.print("[ ");
        for(int i = 0; i < divisors.length; i++) {
            if(i==divisors.length-1){
                System.out.print(divisors[i]);
                break;
            }
            System.out.print(divisors[i]+ ",");
        }
        System.out.print("]");
    }
}