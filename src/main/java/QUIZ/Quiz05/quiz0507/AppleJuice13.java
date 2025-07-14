package QUIZ.Quiz05.quiz0507;

// Quiz 5-7 문제 13: 믹스인 설계
interface Edible13 {
    void eat();
}

interface Drinkable13 {
    void drink();
}

class Apple13 implements Edible13 {
    @Override
    public void eat() {
        System.out.println("Eating an apple.");
    }
}

class Juice13 implements Drinkable13 {
    @Override
    public void drink() {
        System.out.println("Drinking juice.");
    }
}

public class AppleJuice13 implements Edible13, Drinkable13 {
    // TODO: Edible과 Drinkable의 메서드를 모두 구현하세요.
    @Override
    public void eat() {
        System.out.println("Eating an apple.");
    }
    @Override
    public void drink() {
        System.out.println("Drinking juice.");
    }
}

class Main13 {
    public static void main(String[] args) {
        AppleJuice13 aj = new AppleJuice13();
        aj.eat();    // "Eating an apple." 출력
        aj.drink();  // "Drinking juice." 출력
    }
} 