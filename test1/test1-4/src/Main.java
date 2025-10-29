public class Main {
    public static void main(String[] args) {
        double purchase = 1015000;
        double profitRate = 0.3;
        double taxRate = 0.1;

        double sellingPrice;
        double salesTax;
        double purchaseTax;
        double finalTax;

        sellingPrice = purchase * (1 + profitRate);
        salesTax = sellingPrice * taxRate;
        purchaseTax = purchase * taxRate;
        finalTax = salesTax - purchaseTax;

        System.out.println("================================");
        System.out.printf("매입원가: %.0f원\n", purchase);
        System.out.printf("정가(판매가): %.0f원\n", sellingPrice);
        System.out.printf("매출세액(판매세): %.0f원\n", salesTax);
        System.out.printf("매입세액(구매세): %.0f원\n", purchaseTax);
        System.out.printf("납부세액(차액): %.0f원\n", finalTax);
        System.out.println("================================");
    }
}
