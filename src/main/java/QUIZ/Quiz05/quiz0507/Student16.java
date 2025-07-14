package QUIZ.Quiz05.quiz0507;

// Quiz 5-7 문제 16: 인터페이스로 객체 비교
public class Student16 implements Comparable<Student16> {
    private String name;
    private int grade;

    public Student16(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student16 other) {
        // TODO: grade를 기준으로 비교하는 로직을 구현하세요.
        return this.grade - other.grade;
    }

    @Override
    public String toString() {
        return name + ": " + grade;
    }

    public static void main(String[] args) {
        Student16 s1 = new Student16("Alice", 90);
        Student16 s2 = new Student16("Bob", 85);
        System.out.println(s1.compareTo(s2)); // 양수, 음수, 또는 0 출력
    }
} 