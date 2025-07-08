package QUIZ.Quiz03.quiz0311;

// Quiz 3-11 문제 15
public class Q15 {
    public static void main(String[] args) {
        double[] raceTimes = {12.5, 10.8, 13.2, 11.0, 12.1};

        double min = raceTimes[0];
        double max = raceTimes[0];

        for (int i = 1; i < raceTimes.length; i++) {
            if (raceTimes[i] < min) {
                min = raceTimes[i];
            }
            if (raceTimes[i] > max) {
                max = raceTimes[i];
            }
        }

        double range = max - min;
        System.out.println("범위: " + range);
    }
}
