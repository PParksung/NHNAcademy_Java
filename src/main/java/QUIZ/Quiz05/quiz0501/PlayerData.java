package QUIZ.Quiz05.quiz0501;


// Quiz 5-1 문제 1
public class PlayerData {
    String name;
    int age;

    public static void main(String[] args) {
        PlayerData playerdata = new PlayerData();
        playerdata.name = "John";
        playerdata.age = 25;
        System.out.print("이름: " + playerdata.name +", ");
        System.out.print("나이: " + playerdata.age);
    }
}
