package QUIZ.Quiz04.quiz0409;
// Quiz 4-9 문제 4.5: ArrayProcessor 인터페이스와 람다, counter 함수, main 테스트 코드의 기본 틀입니다.
// ArrayProcessor 인터페이스는 별도의 파일(ArrayProcessor.java)에 public interface ArrayProcessor { double apply(double[] array); } 형태로 작성되어 있어야 합니다.
// import QUIZ.Quiz04.quiz0409.ArrayProcessor; // 필요시 주석 해제
public class Problem5 {
    // 배열을 처리하는 함수형 인터페이스 (ArrayProcessor.java 별도 파일 필요)

    // 최대값, 최소값, 합, 평균을 구하는 ArrayProcessor 람다 변수 선언
    public static final ArrayProcessor max = null; // 구현은 직접 작성
    public static final ArrayProcessor min = null;
    public static final ArrayProcessor sum = null;
    public static final ArrayProcessor average = null;

    // 특정 값의 개수를 세는 ArrayProcessor를 반환하는 함수
    public static ArrayProcessor counter(double value) {
        // 람다로 구현
        return null;
    }

    public static void main(String[] args) {
        // 테스트 코드 작성
    }
} 