package QUIZ.Quiz05.quiz0501;

// Quiz 5-1 문제 7
public class Team {
    // TODO: 정적 변수와 인스턴스 변수 선언
    static String teamName = "Warriors";
    String playerName;

    public static void main(String[] args) {
        // TODO: Team 객체 생성 및 데이터 출력
        Team team1 = new Team();
        Team team2 = new Team();
        team1.playerName ="Alice";
        team2.playerName ="Bob";
        System.out.println("Player 1: " + team1.playerName);
        System.out.println("Player 2: " + team2.playerName);
        System.out.println("Team Nmae: " + Team.teamName);

    }
} 