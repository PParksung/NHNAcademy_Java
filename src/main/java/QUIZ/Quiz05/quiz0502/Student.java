package QUIZ.Quiz05.quiz0502;

// Quiz 5-2 문제 8
public class Student {
    static int studentCount;
    String name;

    // TODO: 생성자 작성
    public Student(String name){
        studentCount++;
        this.name = name;
    }

    public static void main(String[] args) {
        // TODO: 여러 Student 객체 생성 및 studentCount 출력
        Student s1 = new Student("1번");
        Student s2 = new Student("2번");
        Student s3 = new Student("3번");

        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);
        System.out.println(studentCount);
    }
} 