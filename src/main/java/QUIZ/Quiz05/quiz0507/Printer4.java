package QUIZ.Quiz05.quiz0507;

// Quiz 5-7 문제 4
public interface Printer4 {
    void print(String content);
}

interface Scanner4 {
    String scan();
}

class MultiFunctionDevice4 implements Printer4, Scanner4 {
    // TODO: Printer와 Scanner 메서드를 구현하세요.
    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }

    @Override
    public String scan() {
        return "Scanning...";
    }
}

class Main4 {
    public static void main(String[] args) {
        MultiFunctionDevice4 device = new MultiFunctionDevice4();
        device.print("Hello, World!"); // "Printing: Hello, World!" 출력
        System.out.println(device.scan()); // "Scanning..." 출력
    }
} 