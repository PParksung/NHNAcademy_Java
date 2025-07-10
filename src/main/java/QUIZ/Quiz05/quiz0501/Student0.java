package QUIZ.Quiz05.quiz0501;

// Quiz 5-1 문제 3
public class Student0 {
    // TODO: 인스턴스 변수와 생성자 선언
    String name;
    int test1;

    public Student0(String name, int test1) {
        this.name = name;
        this.test1 = test1;
    }

    public static void main(String[] args) {
        // TODO: Student 객체 생성 및 데이터 출력
        Student0 student0 = new Student0("Alice", 85);
        System.out.print("이름: " + student0.name + ", 점수: " + student0.test1);
    }
} 