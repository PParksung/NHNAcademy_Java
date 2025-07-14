package QUIZ.Quiz05.quiz0508;

// Quiz 5-8 문제 18
public class Outer18 {
    class Inner18 {
        private int data;

        public Inner18(int data) {
            // TODO: data를 저장하세요.
            this.data = data;
        }

        public void display() {
            // TODO: 저장된 data를 출력하세요.
            System.out.println("Data: " + data);
        }
    }

    public static void main(String[] args) {
        Outer18 outer = new Outer18();
        Outer18.Inner18 inner1 = outer.new Inner18(10);
        Outer18.Inner18 inner2 = outer.new Inner18(20);

        inner1.display(); // "Data: 10" 출력
        inner2.display(); // "Data: 20" 출력
    }
} 