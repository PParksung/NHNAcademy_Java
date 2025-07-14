package QUIZ.Quiz05.quiz0506;

// Quiz 5-6 문제 1
public class Student1 {
    private String name;
    private int age;

    public Student1(String name, int age) {
        // TODO: this를 사용하여 인스턴스 변수를 초기화하세요.
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student1 student = new Student1("Alice", 20);
        student.displayInfo(); // Name: Alice, Age: 20 출력
    }
} 