package QUIZ.Quiz05.quiz0502;

// Quiz 5-2 문제 13
class Parent {
    // TODO: Parent 생성자 작성
    public Parent() {
        System.out.println("Parent 생성자 호출");
    }
}

class Child extends Parent {
    // TODO: Child 생성자 작성
    public Child() {
        System.out.println("Child 생성자 호출");
    }
}

public class ParentChildMain {
    public static void main(String[] args) {
        // TODO: Child 객체 생성
        Child c = new Child();
    }
} 