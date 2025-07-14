package QUIZ.Quiz05.quiz0508;

// Quiz 5-8 문제 4
public class Game4 {
    private int gameScore = 100;

    class Player4 {
        private String name;
        private int playerScore;

        public Player4(String name) {
            this.name = name;
        }

        // TODO: setPlayerScore 메서드와 displayScore 메서드를 작성하세요.
        public int setPlayerScore(int playerScore) {
            this.playerScore = playerScore;
            return playerScore;
        }
        public void displayScore() {
            System.out.println(name + ": " + playerScore + " (Game Score: " + gameScore + ")");
        }

    }

    public static void main(String[] args) {
        Game4 game = new Game4();
        Game4.Player4 player = game.new Player4("Alice");
        player.setPlayerScore(50);
        player.displayScore(); // "Alice: 50 (Game Score: 100)" 출력
    }
} 