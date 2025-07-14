package QUIZ.Quiz05.quiz0507;

// Quiz 5-7 문제 11: 배열과 인터페이스 활용
interface Playable11 {
    void play();
}

public class Guitar11 implements Playable11 {
    @Override
    public void play() {
        System.out.println("Playing the Guitar.");
    }
}

class Piano11 implements Playable11 {
    @Override
    public void play() {
        System.out.println("Playing the Piano.");
    }
}

class Main11 {
    public static void main(String[] args) {
        // TODO: Playable 배열을 생성하고 각 악기를 play()로 실행하세요.
        Playable11[] instruments = new Playable11[2];
        instruments[0] = new Guitar11();
        instruments[1] = new Piano11();
        for (Playable11 instrument : instruments) {
            instrument.play(); // 각 악기에 맞는 메시지 출력
        }
    }
} 