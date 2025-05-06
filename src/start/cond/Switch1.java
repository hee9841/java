package start.cond;


public class Switch1 {

    public static void main(String[] args) {
        ex1(2);
    }

    static void ex1(int grade) {
        int coupon;
        switch (grade) {
            case 1 :
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }

        System.out.println("coupon = " + coupon);

        int newSwitch = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };

        System.out.println("newSwitch = " + newSwitch);
    }
}
