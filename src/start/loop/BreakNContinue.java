package start.loop;


import start.operator.Operator1;

public class BreakNContinue {

    public static void main(String[] args) {
        Breaks breaks = new Breaks();
        breaks.ex1();
        breaks.ex2();
    }

    public static class Breaks {

        void ex1() {
            // 1부터 시작해서 숫자를 계속 누적해서 더하다가 합계가 10보다 처음으로 큰 값은 얼마인가?
            int sum = 0;
            int i = 0;
            while (true) {
                sum += i;
                if (sum > 10) {
                    System.out.println("합이 10다 큼 : i = " + i + ", sum=" + sum);
                    break;
                }
                i++;
            }
        }

        void ex2() {
            //문제: 1부터 5까지 숫자를 출력하는데, 숫자가 3일 때는 출력을 건너뛰어야 한다.
            int i =1;
            while (i <= 5) {
                if (i == 3) {
                    i++;
                    continue;
                }

                System.out.println("i = " + i);
                i++;
            }
        }
    }



}
