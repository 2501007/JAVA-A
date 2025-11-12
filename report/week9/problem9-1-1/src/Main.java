public class Main {
    public static void main(String[] args) {
        int total = 37;
        int legs = 102;
        int chicken, dog;

        for (chicken = 0; chicken <= total; chicken++) {
            dog = total - chicken;
            if (2 * chicken + 4 * dog == legs) {
                System.out.printf("닭: %d마리, 개: %d마리\n", chicken, dog);
                break;
            }
        }
    }
}