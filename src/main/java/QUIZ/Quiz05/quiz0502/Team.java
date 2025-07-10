package QUIZ.Quiz05.quiz0502;

// Quiz 5-2 문제 11
public class Team {
    String[] players;

    // TODO: 생성자 작성
    public Team() {
        players = new String[2];
        players[0] = "Alice";
        players[1] = "Bob";
    }

    public static void main(String[] args) {
        // TODO: Team 객체 생성 및 배열 요소 출력
        Team team = new Team();
        for (String player : team.players) {
            System.out.println(player);
        }
    }
} 