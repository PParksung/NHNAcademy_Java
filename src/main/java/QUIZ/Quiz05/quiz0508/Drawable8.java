package QUIZ.Quiz05.quiz0508;

// Quiz 5-8 문제 8
public interface Drawable8 {
    void draw();
}

class Main8 {
    public static void main(String[] args) {
        // TODO: 람다 표현식을 사용하여 Drawable 구현체를 작성하세요.
        Drawable8 drawable = () -> {
            // "Drawing a shape" 출력
            System.out.println("Drawing a shape");
        };
        drawable.draw();
    }
} 