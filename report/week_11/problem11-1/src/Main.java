import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner keyboard = new Scanner(System.in);

        final int COUNT = 10;
        final int BASE = 1200;

        String[] num = new String[COUNT];
        String[] name = new String[COUNT];
        int[] code = new int[COUNT];
        float[] use = new float[COUNT];

        int[] price = new int[COUNT];
        int[] tax = new int[COUNT];
        int[] pay = new int[COUNT];

        String[] typeName = {"", "가정용", "영업용", "공장용", "관공서", "군기관"};
        int[] unitPrice = {0, 40, 55, 78, 35, 20};
        double[] taxRate = {0, 0.05, 0.035, 0.025, 0.015, 0.0};

        int i = 0;

        while (i < COUNT) {
            System.out.print("번호 이름 구분 사용량 입력 : ");
            num[i] = keyboard.next();
            name[i] = keyboard.next();
            code[i] = keyboard.nextInt();
            use[i] = keyboard.nextFloat();

            if (num[i].length() == 4 && code[i] >= 1 && code[i] <= 5 && use[i] >= 0) {

                int useInt = Math.round(use[i]);

                price[i] = useInt * unitPrice[code[i]];

                double tempTax = (BASE + price[i]) * taxRate[code[i]];
                tax[i] = (int)(tempTax / 10) * 10;

                pay[i] = BASE + price[i] + tax[i];

                i++;
                System.out.println();

            } else {
                System.err.println("ERROR : 입력값 확인 (번호4자리, 구분1~5범위)");
                System.in.read();
            }
        }

        System.out.println("------------------------------------------------------------------");
        System.out.println(" 번호   이름   구분    사용량   사용금액    TAX     납부금액");
        System.out.println("------------------------------------------------------------------");

        for (i = 0; i < COUNT; i++) {
            System.out.printf("%5s %5s %6s %8.1f %10d %8d %10d\n",
                    num[i], name[i], typeName[code[i]], use[i],
                    price[i], tax[i], pay[i]);
        }

        System.out.println("------------------------------------------------------------------");
    }
}
