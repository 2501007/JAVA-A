import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[10];
        int total = 0;
        int max = 0;
        int min = 100;

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + " : ");
            score[i] = sc.nextInt();
            total += score[i];
            if (score[i] > max) max = score[i];
            if (score[i] < min) min = score[i];
        }

        float average = (float) total / 10;

        System.out.println("\n결과:");
        System.out.println("합계 : " + total);
        System.out.printf("평균 : %.2f\n", average);
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }
}
