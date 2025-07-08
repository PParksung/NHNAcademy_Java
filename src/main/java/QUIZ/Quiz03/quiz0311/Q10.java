package QUIZ.Quiz03.quiz0311;

// Quiz 3-11 문제 10
public class Q10 {
    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "456";

        try {
            int num1 = Integer.parseInt(s1);
            int num2 = Integer.parseInt(s2);
            int sum = num1 + num2;
            System.out.println("합계: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("오류: 문자열을 정수로 변환할 수 없습니다.");
        }
    }
}