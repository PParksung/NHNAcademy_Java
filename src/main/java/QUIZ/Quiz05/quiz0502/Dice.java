package QUIZ.Quiz05.quiz0502;

// Quiz 5-2 문제 4
public class Dice {
    int faceValue;

    // TODO: 생성자 작성
    public Dice(){
        roll();
    }

    public void roll() {
        // TODO: faceValue를 1에서 6 사이의 랜덤 값으로 설정
        faceValue = (int) (Math.random() * 6) + 1;
    }

    public static void main(String[] args) {
        // TODO: Dice 객체 생성 및 초기값 출력
        Dice dice = new Dice();
        System.out.print("초기 주사위 값: " + dice.faceValue);
    }
} 