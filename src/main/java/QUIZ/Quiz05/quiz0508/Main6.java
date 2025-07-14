package QUIZ.Quiz05.quiz0508;

// Quiz 5-8 문제 6
public class Main6 {
    interface Button6 {
        void click();
    }

    public static void main(String[] args) {
        // TODO: 익명 내부 클래스를 사용하여 Button 구현체를 작성하세요.
        Button6 button = new Button6() {
            @Override
            public void click() {
                // "Button clicked" 출력
                System.out.println("Button clicked");
            }
        };
        button.click();
    }
} 