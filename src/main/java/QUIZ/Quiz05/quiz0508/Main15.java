package QUIZ.Quiz05.quiz0508;

// Quiz 5-8 문제 15
public class Main15 {
    public static void main(String[] args) {
        // TODO: 익명 내부 클래스를 사용하여 Comparable 구현체를 작성하세요.
        Comparable<String> comparator = new Comparable<>() {
            @Override
            public int compareTo(String other) {
                return "Hello".compareTo(other); // 수정 필요
            }
        };

        System.out.println(comparator.compareTo("Hello")); // "0" 또는 비교 결과
    }
} 