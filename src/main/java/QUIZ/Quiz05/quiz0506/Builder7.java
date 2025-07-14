package QUIZ.Quiz05.quiz0506;

// Quiz 5-6 문제 7
public class Builder7 {
    private String result = "";

    public Builder7 append(String text) {
        this.result += text;
        return this; // TODO: this를 리턴하여 메서드 체이닝 지원
    }

    public void print() {
        System.out.println(result);
    }

    public static void main(String[] args) {
        Builder7 builder = new Builder7();
        builder.append("Hello").append(" ").append("World!").print(); // Hello World! 출력
    }
} 