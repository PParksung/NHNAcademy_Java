package QUIZ.Quiz05.quiz0501;

// Quiz 5-1 문제 2
public class GameData {
    // TODO: 정적 변수와 비정적 변수 선언
    static int totalPlayers = 0;
    String playerName;

    public GameData() {
        totalPlayers++;
    }
    public static void main(String[] args) {
        // TODO: GameData 객체 두 개 생성
        GameData gd1 = new GameData();
        GameData gd2 = new GameData();
        // TODO: 각 객체의 playerName 설정
        gd1.playerName = "플레이어1";
        gd2.playerName = "플레이어2";
        // TODO: totalPlayers 값 출력
        System.out.println(totalPlayers);
    }
} 