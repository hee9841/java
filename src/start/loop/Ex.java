package start.loop;


public class Ex {

    public static void main(String[] args) {
        Examples ex = new Examples();

//        ex.ex3_for(1);
//        ex.ex3_while(1);
//        System.out.println();
//
//        ex.ex3_for(2);
//        ex.ex3_while(2);
//        System.out.println();
//        ex.ex3_for(3);
//        ex.ex3_while(3);
//        System.out.println();
//        ex.ex3_for(100);
//        ex.ex3_while(100);

//        ex.ex4();

        ex.ex5(2);
        ex.ex5(5);
    }


    public static class Examples {
        void ex1_for() {
            //처음 10개의 자연수를 출력하는 프로그램을 작성해 보세요
            // count 라는 변수를 사용해야 합니다.
            //for, while 2가지
            for (int cnt = 1; cnt < 11; cnt++) {
                System.out.println(cnt);
            }
        }

        void ex1_while() {
            System.out.println("while-----");
            int cnt = 1;
            while (true) {
                if (cnt > 10) {
                    break;
                }
                System.out.println(cnt++);
            }
        }

        void ex2_for() {
            for (int num = 2, cnt = 0; cnt < 10; num += 2, cnt++) {
                System.out.println(num);
            }
        }

        void ex2_while() {
            System.out.println("while-----");
            int num = 2;
            int cnt = 1;
            while (cnt++ <= 10) {
                System.out.println(num);
                num += 2;
            }

        }

        //누적합
        void ex3_while(int max) {
            //1부터 max까지의 합을 계산하고, 출력하는
            //sum, 누적합, i : 카운트
            int sum = 0;
            int i = 0;
            while (i++ < max) {
                sum += i;
            }

            System.out.println(sum);
        }

        void ex3_for(int max) {
            int sum = 0;

            for (int i = 0; i < max; i++) {
                sum += i + 1;
            }

            System.out.println(sum);
        }

        void ex4() {
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= 9; j++) {
                    System.out.println(i + " * " + j + " = " + i*j);
                }
            }
        }

        void ex5(int rows) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
