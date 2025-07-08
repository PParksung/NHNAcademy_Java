package QUIZ.Quiz02.quiz0203;

//Quiz 2-3 문제 10
public class TaskTimer {
    public static void main(String[] args) {
        // TODO: 시작 시간 저장
        long start_time = System.nanoTime();

        // 작업: 1부터 100까지 출력
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        // TODO: 종료 시간 저장
        long end_time = System.nanoTime();

        // TODO: 소요 시간 계산
        long result_time = end_time-start_time;

        // TODO: 소요 시간 출력
        System.out.println("작업 소요 시간(초):  " + result_time);
    }
}
