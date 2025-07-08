package QUIZ.Quiz04.quiz0403;

// Quiz 4-3 문제 1
public class Problem1 {
    /**
     * 주어진 양의 정수 startingValue로부터 3N+1 시퀀스를 출력하고,
     * 시퀀스에 포함된 항의 개수를 반환합니다.
     */
    public static int print3NSequence(int startingValue) {
        // TODO: 시작 값이 양수가 아니면 IllegalArgumentException 던지기
        int count = 0;
        System.out.printf("시작값 %d의 3N+1 시퀀스: \n", startingValue);

        try{
            if(startingValue <= 0){
                throw new IllegalArgumentException();
            }
            do{
                count++;
                System.out.println(startingValue);
                if (startingValue % 2 == 0) {
                    startingValue = startingValue / 2;
                } else {
                    startingValue = 3 * startingValue + 1;
                }
            }while(startingValue != 1);
            System.out.println("1");
            count++;
            System.out.printf("시퀀스에는 %d개의 항이 포함되어 있습니다.\n", count);
        }catch(IllegalArgumentException e){
            System.out.println("시작 값은 양수여야함");
        }
        // TODO: 3N+1 시퀀스 출력 및 시퀀스 길이 계산
        return count; // TODO: 시퀀스 길이를 반환
    }

    public static void main(String[] args) {
        int startingValue = -2; // 테스트할 시작 값
        int sequenceLength = print3NSequence(startingValue);
        System.out.println("시퀀스 길이: " + sequenceLength);
    }
} 