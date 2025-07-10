package QUIZ.Quiz05.quiz0502;

// Quiz 5-2 문제 5
public class Character {
    String name;
    int health;
    boolean isAlive;

    public static void main(String[] args) {
        // TODO: Character 객체 생성 및 기본값 출력
        Character character = new Character();
        System.out.print("기본값들: " + character.name + " " +  character.health + " " + character.isAlive + " ");
    }
} 