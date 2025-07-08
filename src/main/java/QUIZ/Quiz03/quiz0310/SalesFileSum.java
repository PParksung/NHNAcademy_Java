package QUIZ.Quiz03.quiz0310;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Quiz 3-10 문제 5번
public class SalesFileSum {
    public static void main(String[] args) {
        double totalSales = 0.0;
        int noDataCityCount = 0;

        try {
            File file = new File("sales.dat");
            Scanner input = new Scanner(file);

            while (input.hasNextLine()) {
                String line = input.nextLine();
                int colonIndex = line.indexOf(':');

                if (colonIndex == -1) {
                    continue;
                }

                String data = line.substring(colonIndex + 1).trim();

                try {
                    double saleAmount = Double.parseDouble(data);
                    totalSales = totalSales + saleAmount;
                } catch (NumberFormatException e) {
                    noDataCityCount ++;
                }
            }

            System.out.printf("총 판매액: $%.2f\n", totalSales);

            if (noDataCityCount == 0) {
                System.out.println("모든 도시에서 판매 데이터가 있습니다.");
            } else if (noDataCityCount == 1) {
                System.out.println("판매 데이터가 없는 도시는 1곳입니다.");
            } else {
                System.out.println("판매 데이터가 없는 도시는 " + noDataCityCount + "곳입니다.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("파일 'sales.dat'을 찾을 수 없습니다.");
            System.out.println("파일이 프로그램과 같은 폴더에 있는지 확인하세요.");
        }
    }
}
