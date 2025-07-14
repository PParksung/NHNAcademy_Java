package QUIZ.Quiz05.quiz0506;

// Quiz 5-6 문제 19
class Machine19 {
    private String type;

    public Machine19(String type) {
        this.type = type;
    }

    public void displayType() {
        System.out.println("Type: " + type);
    }
}

class Computer19 extends Machine19 {
    private String processor;

    public Computer19() {
        this("Default Type", "Intel i5"); // TODO: this를 사용하여 다른 생성자 호출
    }

    public Computer19(String type, String processor) {
        super(type); // TODO: super를 사용하여 Machine의 생성자 호출
        this.processor = processor;
    }

    public void displayInfo() {
        displayType();
        System.out.println("Processor: " + processor);
    }
}

class Main19 {
    public static void main(String[] args) {
        Computer19 computer = new Computer19();
        computer.displayInfo();
        // Type: Default Type
        // Processor: Intel i5 출력
    }
} 