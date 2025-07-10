package QUIZ.Quiz05.quiz0501;

// Quiz 5-1 문제 11
public class Player1 {
    // TODO: 인스턴스 변수와 생성자 선언
    String name;
    int score;

    Player1(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public static void main(String[] args) {
        // TODO: Player 객체 배열 생성 및 데이터 저장
        Player1[] arr = new Player1[3];
        arr[0] = new Player1("Alice", 90);
        arr[1] = new Player1("Bob", 85);
        arr[2] = new Player1("Charlie", 88);

        // TODO: 배열 데이터 출력
        for(Player1 player : arr){
            System.out.println("이름: " + player.name + ", 점수: " + player.score);
        }
    }
} 