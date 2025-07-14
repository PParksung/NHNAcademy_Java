package QUIZ.Quiz05.quiz0506;

// Quiz 5-6 문제 4
class Parent4 {
    String name = "Parent";
}

class Child4 extends Parent4 {
    String name = "Child";

    public void displayNames() {
        System.out.println("Name from child: " + this.name);
        // TODO: super를 사용하여 Parent 클래스의 name 변수 출력
        System.out.println("Name from parent: " + super.name);
    }
}

class Main4 {
    public static void main(String[] args) {
        Child4 child = new Child4();
        child.displayNames();
        // Name from child: Child
        // Name from parent: Parent
    }
} 