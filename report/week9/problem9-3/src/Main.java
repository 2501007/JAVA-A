public class Main {
    public static void main(String[] args) {
        int well = 300;
        int up = 55;
        int down = 13;
        int height = 0;
        int day = 0;
        boolean success = false;

        while (height < well && day < 7) {
            day++;
            height += up;
            if (height >= well) {
                success = true;
                break;
            }
            height -= down;
        }

        if (success)
            System.out.printf("달팽이는 %d일 만에 방울꽃 곁을 지킬 수 있었습니다.\n", day);
        else
            System.out.println("달팽이는 일주일 안에 방울꽃 곁을 지키지 못했습니다.");
    }
}
