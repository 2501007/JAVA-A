import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int amount;
        boolean membership;

        System.out.print("구매 금액을 입력하세요: ");
        amount = keyboard.nextInt();

        System.out.print("멤버십 회원입니까? (true 또는 false): ");
        membership = keyboard.nextBoolean();

        if (amount >= 50000 || (membership && amount >= 30000)) {
            System.out.println("무료배송 가능");
        } else {
            System.out.println("무료배송 불가");
        }
    }
}