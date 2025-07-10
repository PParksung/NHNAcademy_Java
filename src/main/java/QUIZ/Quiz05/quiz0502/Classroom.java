package QUIZ.Quiz05.quiz0502;

// Quiz 5-2 문제 15
public class Classroom {
    String[] students;

    // TODO: 생성자 작성
    public Classroom(String[] students) {
        this.students = students;
    }

    public static void main(String[] args) {
        // TODO: Classroom 객체 생성 및 배열 요소 출력
        String[] arr = {"Alice", "Bob", "Charlie"};
        Classroom c = new Classroom(arr);
        for (String s : c.students) {
            System.out.println(s);
        }
    }
} 