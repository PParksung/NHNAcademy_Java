package QUIZ.Quiz05.quiz0506;

// Quiz 5-6 문제 3
class Animal3 {
    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog3 extends Animal3 {
    @Override
    public void sound() {
        super.sound(); // TODO: 슈퍼클래스의 sound 메서드 호출
        System.out.println("Dog barks.");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Dog3 dog = new Dog3();
        dog.sound(); // Animal makes a sound. Dog barks. 출력
    }
} 