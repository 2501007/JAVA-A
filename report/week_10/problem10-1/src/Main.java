import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner keyboard = new Scanner(System.in);

        int[] ip = new int[5];
        int nogood = 0;
        int total = 0;

        int data;
        System.out.print("투표 번호 입력 : ");

        while (keyboard.hasNextInt()) {
            data = keyboard.nextInt();
            total++;

            if (data >= 1 && data <= 4)
                ip[data]++;
            else
                nogood++;

            System.out.print("투표 번호 입력 : ");
        }

        System.out.println();
        System.out.println("득표수");
        System.out.printf("1번 : %d표\n", ip[1]);
        System.out.printf("2번 : %d표\n", ip[2]);
        System.out.printf("3번 : %d표\n", ip[3]);
        System.out.printf("4번 : %d표\n", ip[4]);
        System.out.printf("무효표 : %d표\n", nogood);
        System.out.printf("총 %d표\n", total);
    }
}
