package QUIZ.Quiz05.quiz0508;

// Quiz 5-8 문제 2
public class MathOperations2 {
    // TODO: 정적 중첩 클래스 Addition2를 작성하고, add 메서드를 구현하세요.
    static class Addition2{
        public int add(int a, int b){
            return a+b;
        }
    }

    public static void main(String[] args) {
        MathOperations2.Addition2 addition = new MathOperations2.Addition2();
        System.out.println(addition.add(5, 3)); // 8 출력
    }
} 