package QUIZ.Quiz05.quiz0508;

// Quiz 5-8 문제 19
interface ClickListener19 {
    void onClick();
}

public class Main19 {
    public static void main(String[] args) {
        // TODO: 익명 내부 클래스를 사용하여 ClickListener 구현체를 작성하세요.
        ClickListener19 listener = new ClickListener19() {
            @Override
            public void onClick() {
                // "Button clicked!" 출력
                System.out.println("Button clicked!");
            }
        };

        listener.onClick();
    }
} 