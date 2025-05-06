package start.operator;


public class For {

    public static void main(String[] args) {
        For1 for1 = new For1();
        for1.ex1();
    }

    public static class For1 {
        //: i부터 하나씩 증가하는 수를 endNum(마지막 수)까지 더해라 (i ~ endNum 더하기
        void ex1() {
            int sum = 0;
            int endNUm = 3;

            for (int i = 1; i <= endNUm; i++) {
                sum += i;
                System.out.println("i=" + i + ", sum=" + sum);
            }
        }

        void ex2() {
            //제: 1부터 시작하여 숫자를 계속 누적해서 더하다가 합계가 10보다 큰 처음 값은 얼마인가?
            int sum = 0;
            int i = 1;

            for (; ; ) {
                sum += i;
                if (sum > 10) {
                    System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                    break;
                }
                i++;
            }

        }

        void ex3() {
            //제: 1부터 시작하여 숫자를 계속 누적해서 더하다가 합계가 10보다 큰 처음 값은 얼마인가?
            int sum = 0;

            for (int i = 1; ; i++) {
                sum += i;
                if (sum > 10) {
                    System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                    break;
                }
                i++;
            }

        }
    }
    
    // 중첩반복문
    public static class Nested1 {
        
    }
}
