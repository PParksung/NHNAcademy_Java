package QUIZ.Quiz05.quiz0502;

// Quiz 5-2 문제 10
public class Game {
    String name;

    // TODO: 기본 생성자 작성
    // TODO: 매개변수 생성자 작성

    public Game(){
        this("생성자 호출");
    }
    public Game(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        // TODO: Game 객체 생성 및 출력
        Game game = new Game();
        System.out.println(game.name);
    }
} 