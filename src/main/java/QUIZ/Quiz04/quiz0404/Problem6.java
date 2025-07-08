package QUIZ.Quiz04.quiz0404;

// Quiz 4-4 문제 6
public class Problem6 {
    public static void main(String[] args) {
        // TODO: countDown 서브루틴을 호출하여 10부터 1까지 출력하고 마지막 숫자 반환
        int last = countDown();
        System.out.println("마지막 숫자 : " + last);
    }

    public static int countDown() {
        // TODO: 10부터 1까지 숫자 출력 후, 마지막 숫자 반환
        for(int i=10; i>=0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        return 1;
    }
}