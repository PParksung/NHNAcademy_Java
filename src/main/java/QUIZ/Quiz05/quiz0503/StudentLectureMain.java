package QUIZ.Quiz05.quiz0503;

// Quiz 5-3 문제 9
import java.util.ArrayList;

// TODO: Student 클래스 작성
class Student {
    String name;
    int score;
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

// TODO: Lecture 클래스 작성
class Lecture {
    String lectureName;
    ArrayList<Student> students = new ArrayList<>();

    public Lecture(String lectureName) {
        this.lectureName = lectureName;
    }
    public void addStudent(Student student) {
        students.add(student);
    }
}

public class StudentLectureMain {
    public static void main(String[] args) {
        // TODO: 객체 생성 및 데이터 출력
        Lecture lec = new Lecture("Java");
        lec.addStudent(new Student("Alice", 90));
        lec.addStudent(new Student("Bob", 85));

        System.out.println("강의명: " + lec.lectureName);
        for (Student s : lec.students) {
            System.out.println("학생 이름: " + s.name + ", 점수: " + s.score);
        }
    }
} 