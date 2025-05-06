package start.scopeNCasting;


public class Casting3 {

    public static void main(String[] args) {
        ex2();
    }

    static void ex1() {
        long maxIntVal = 2147483647L; //
        long maxIntOver = 2147483648L; ////int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntVal;
        System.out.println("maxIntValue casting = " + intValue); //2147483647

        intValue = (int) maxIntOver;
        System.out.println("maxIntOver  casting= " + intValue); //출력:-2147483648
        //maxIntOver는 int 범위를 넘아가서 akwlakr에 L을 붙어 long형을 사용해야함.
        //기존 범위 초과 -> 오버플로우
        //-2147483648는 int의 가장 작은 값
    }

    static void ex2() {
        int div1 = 3 / 2;
        System.out.println("div1 = " + div1);   //1

        double div2 = 3 / 2;
        System.out.println("div2 = " + div2);   //1.0

        double div3 = 3.0 / 2;
        System.out.println("div3 = " + div3);   //1.5

        double div4 = (double) 3 / 2;
        System.out.println("div4 = " + div4);  // 1.5


        int a = 3;
        int b =2;
        double result = (double) a / b;
        System.out.println("result = " + result);

        //1. r
    }


}
