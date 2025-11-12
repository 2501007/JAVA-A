public class Main {
    public static void main(String[] args) {
        int coin500 = 500;
        int coin100 = 100;
        int count500 = 10;
        int count100 = 10;

        int monthAmount = (coin500 * count500) + (coin100 * count100);
        int totalAmount = 0;

        for (int month = 1; month <= 12 * 30; month++) {
            totalAmount += monthAmount;
        }

        System.out.printf("30년 총 저금액: %,d원\n", totalAmount);
    }
}
