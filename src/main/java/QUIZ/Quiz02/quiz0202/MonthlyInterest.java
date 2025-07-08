package QUIZ.Quiz02.quiz0202;

// Quiz 2-2 문제 5
public class MonthlyInterest {
    public static void main(String[] args) {
        // TODO: 초기 잔액
        // TODO: 월 이율
        double balance = 100;
        double rate = 0.05;
        for (int month = 1; month <= 12; month++) {
            // TODO: 매달 이자 추가
            balance += balance * rate;
        }

        // TODO: 최종 balance를 "최종 잔액: " 뒤에 출력합니다.
        System.out.println("최종 잔액: " + balance);
    }
}
