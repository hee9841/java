package start.operator;

public class Operator1 {

    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum = a + b;
        System.out.println("a + b = " + sum);


        int diff = a - b;
        System.out.println("a - b = " + diff);

        int multi = a * b;
        System.out.println("a * b = " + multi);

        int div = a / b; // 2(정수만 표현)
        System.out.println("a / b = " + div);

        int mod = a % b;
        System.out.println("a % b = " + mod);

        double aa  = 5;
        double bb  = 2;

        System.out.println((aa / bb));
        double ddd = (double) a / b;
        System.out.println("ddd = " + ddd);

//        int x  = 10 / 0;
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
    }
}
