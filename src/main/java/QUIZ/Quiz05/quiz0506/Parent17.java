package QUIZ.Quiz05.quiz0506;

// Quiz 5-6 문제 17
class Parent17 {
    public Parent17() {
        System.out.println("Parent's constructor called");
    }
}

class Child17 extends Parent17 {
    public Child17() {
        super(); // TODO: super를 사용하여 Parent의 기본 생성자 호출
        System.out.println("Child's constructor called");
    }
}

class Main17 {
    public static void main(String[] args) {
        Child17 child = new Child17();
        // Parent's constructor called
        // Child's constructor called
    }
} 