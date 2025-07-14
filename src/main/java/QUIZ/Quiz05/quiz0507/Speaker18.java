package QUIZ.Quiz05.quiz0507;

// Quiz 5-7 문제 18: 인터페이스와 익명 클래스
interface Speaker18 {
    void speak();
}

class Main18 {
    public static void main(String[] args) {
        // TODO: 익명 클래스를 사용하여 Speaker 인터페이스를 구현하세요.
        Speaker18 speaker = new Speaker18() {
            @Override
            public void speak() {
                System.out.println("Hello from an anonymous class!");
            }
        };
        speaker.speak(); // "Hello from an anonymous class!" 출력
    }
} 