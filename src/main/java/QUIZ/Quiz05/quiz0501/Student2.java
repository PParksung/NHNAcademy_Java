package QUIZ.Quiz05.quiz0501;

// Quiz 5-1 문제 15
public class Student2 {
    // TODO: 인스턴스 변수 선언
    String name;

    public static void main(String[] args) {
        // TODO: Student 객체 생성 및 참조 공유
        Student2 student2 = new Student2();
        Student2 student21 = student2;
        // TODO: 데이터 수정 및 결과 출력
        student2.name = "Alice";
        student21.name = "Bob";
        System.out.println("Student 1 Name: " + student2.name);
        System.out.println("Student 2 Name: " + student21.name);
    }
} 