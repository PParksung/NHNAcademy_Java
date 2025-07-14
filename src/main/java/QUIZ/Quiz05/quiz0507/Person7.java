package QUIZ.Quiz05.quiz0507;

// Quiz 5-7 문제 7: 믹스인 구현
interface Walkable7 {
    void walk();
}

interface Runnable7 {
    void run();
}

public class Person7 implements Walkable7, Runnable7 {
    // TODO: walk()와 run() 메서드를 구현하세요.
    @Override
    public void walk() {
        System.out.println("Person is walking.");
    }
    @Override
    public void run() {
        System.out.println("Person is running.");
    }
}

class Main7 {
    public static void main(String[] args) {
        Person7 person = new Person7();
        person.walk(); // "Person is walking." 출력
        person.run();  // "Person is running." 출력
    }
} 