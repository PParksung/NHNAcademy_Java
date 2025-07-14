package QUIZ.Quiz05.quiz0507;

// Quiz 5-7 문제 19: 인터페이스 상속과 다형성
interface Animal19 {
    void sound();
}

interface Pet19 extends Animal19 {
    void play();
}

public class Dog19 implements Pet19 {
    @Override
    public void sound() {
        System.out.println("Woof!");
    }
    @Override
    public void play() {
        System.out.println("Playing fetch.");
    }
}

class Main19 {
    public static void main(String[] args) {
        Pet19 myPet = new Dog19();
        myPet.sound(); // "Woof!" 출력
        myPet.play();  // "Playing fetch." 출력
    }
} 