package QUIZ.Quiz05.quiz0502;

// Quiz 5-2 문제 3
public class Player {
    String name;
    int score;

    // TODO: 기본 생성자 작성
    // TODO: 매개변수 생성자 작성
    public Player(){
        name = "박성민";
        score = 100;
    }

    public Player(String name, int score){
        this.name = name;
        this.score = score;
    }

    public static void main(String[] args) {
        // TODO: Player 객체 두 개 생성 및 출력
        Player p1 = new Player();
        Player p2 = new Player("Alice", 50);

        System.out.println("Player1 이름: " + p1.name + ", 점수: " + p1.score);
        System.out.println("Player2 이름: " + p2.name + ", 점수: " + p2.score);
    }
} 