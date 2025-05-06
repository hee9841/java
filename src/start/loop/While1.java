package start.loop;


public class While1 {

    public static void main(String[] args) {
//        ex2(10);
        ex3_doWhile();
    }

    static void ex1() {
        int cnt = 0;

        while (cnt < 0) {
            cnt++;
        }
    }

    static void ex2(int endNum) {
        int sum = 0;
        int i = 1;

        while (i <= endNum) {
            sum += i;
            System.out.println("i=" + i + " sum=" + sum);
            i++;
        }
    }

    static void ex3_doWhile() {
        int i = 2;
        do {
            System.out.println("현재 숫자는 " + i);
            i++;
        } while (i < 9);

        System.out.println("ddd");
        do {
            System.out.println("현재 숫자는 " + i);
            i++;
        }  while (i < 3);
    }
}
