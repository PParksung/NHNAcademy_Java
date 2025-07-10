package QUIZ.Quiz05.quiz0501;

// Quiz 5-1 문제 20
public class User {
    // TODO: 인스턴스 변수와 생성자 선언
    String username;
    String userID;

    public static void main(String[] args) {
        // TODO: User 객체 생성 및 데이터 출력
        User user = new User();
        user.username = "Alice";
        user.userID = "101";
        System.out.print("UserName: " + user.username + ", UserID: " + user.userID);

    }
} 