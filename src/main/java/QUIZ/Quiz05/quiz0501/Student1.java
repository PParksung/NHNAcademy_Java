package QUIZ.Quiz05.quiz0501;

// Quiz 5-1 문제 6
public class Student1 {
    // TODO: 인스턴스 변수와 생성자 선언
    String name;
    int test1;

    Student1(String name, int test1) {
        this.name = name;
        this.test1 = test1;
    }

    public static void main(String[] args) {
        // TODO: Student 객체 배열 생성 및 데이터 저장
        Student1[] student1 = new Student1[3];
        // TODO: 모든 학생의 데이터 출력
        student1[0] = new Student1("Alice", 85);
        student1[1] = new Student1("Bob", 90);
        student1[2] = new Student1("Charlie", 78);

        System.out.println("이름: " + student1[0].name + ", 점수: " + student1[0].test1);
        System.out.println("이름: " + student1[1].name + ", 점수: " + student1[1].test1);
        System.out.println("이름: " + student1[2].name + ", 점수: " + student1[2].test1);

    }
} 