package QUIZ.Quiz05.quiz0508;

// Quiz 5-8 문제 12
public class Outer12 {
    class Inner12 {
        private int value;

        public Inner12(int value) {
            // TODO: 전달받은 값을 변수에 저장하세요.
            this.value = value;
        }

        public void display() {
            // TODO: 저장된 값을 출력하세요.
            System.out.println("Value: " + value);
        }
    }

    public static void main(String[] args) {
        Outer12 outer = new Outer12();
        Outer12.Inner12 inner = outer.new Inner12(42);
        inner.display(); // "Value: 42" 출력
    }
} 