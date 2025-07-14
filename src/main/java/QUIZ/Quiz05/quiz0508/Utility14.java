package QUIZ.Quiz05.quiz0508;

// Quiz 5-8 문제 14
public class Utility14 {
    static class Converter14 {
        // TODO: celsiusToFahrenheit 메서드를 작성하세요.
        public double celsiusToFahrenheit(double celsius) {
            return celsius * 9 / 5 + 32;
        }
    }

    public static void main(String[] args) {
        Utility14.Converter14 converter = new Utility14.Converter14();
        System.out.println(converter.celsiusToFahrenheit(0)); // 32.0 출력
    }
} 