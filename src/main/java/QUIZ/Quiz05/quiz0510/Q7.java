package QUIZ.Quiz05.quiz0510;

// Quiz 5-10 문제 7
public class Q7 {
    public class Player {
        private String name;
        private int score;

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setScore(int score) {
            this.score = score;
        }
    }

    public static void main(String[] args) {
        Q7 outer = new Q7();
        Player p = outer.new Player();

        p.setName("Alice");
        p.setScore(90);

        System.out.println("이름: " + p.getName());
        System.out.println("점수: " + p.getScore());
    }
}
