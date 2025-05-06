package start.operator;


public class OperatorEx {

    public static void main(String[] args) {
//        ex2();
        ex3(80);
    }

    static void ex1() {

        System.out.println("start ex1()");

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = num1 + num2 + num3;
        int avg = sum / 3;

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);

    }

    static void ex2() {
        System.out.println("start ex2()");

        double val1 = 1.5;
        double val2 = 2.5;
        double val3 = 3.5;

        double sum = val1 + val2 + val3;
        double avg = sum / 3;

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }

    static void ex3(int score) {
        System.out.println("start ex3()");

        System.out.println(80 <= score && score <= 100);
    }
}
