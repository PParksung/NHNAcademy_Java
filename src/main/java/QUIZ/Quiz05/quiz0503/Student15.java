package QUIZ.Quiz05.quiz0503;

// Quiz 5-3 문제 15
public class Student15 {
    String name;
    int score;

    public Student15(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public static void main(String[] args) {
        // TODO: Student 객체 배열 생성 및 출력
        Student15[] students = {
            new Student15("Alice", 90),
            new Student15("Bob", 85),
            new Student15("Charlie", 78)
        };
        for (Student15 s : students) {
            System.out.println("이름: " + s.name + ", 점수: " + s.score);
        }
    }
} 