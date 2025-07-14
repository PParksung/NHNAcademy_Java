package QUIZ.Quiz05.quiz0506;

// Quiz 5-6 문제 13
class Parent13 {
    public void greet() {
        System.out.println("Hello from Parent");
    }
}

class Child13 extends Parent13 {
    @Override
    public void greet() {
        System.out.println("Hello from Child");
    }

    public void callGreetMethods() {
        // TODO: this와 super를 사용하여 각각의 greet 메서드를 호출하세요.
        this.greet();
        super.greet();
    }
}

class Main13 {
    public static void main(String[] args) {
        Child13 child = new Child13();
        child.callGreetMethods();
        // Hello from Child
        // Hello from Parent
    }
} 