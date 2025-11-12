public class Main {
    public static void main(String[] args) {
        int total = 37;
        int legs = 102;
        int chicken = 0, dog;

        while (chicken <= total) {
            dog = total - chicken;
            if (2 * chicken + 4 * dog == legs) {
                System.out.printf("닭: %d마리, 개: %d마리\n", chicken, dog);
                break;
            }
            chicken++;
        }
    }
}