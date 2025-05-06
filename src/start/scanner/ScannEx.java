package start.scanner;


import java.util.Scanner;

public class ScannEx {
    //ex1
    //당신의 이름을 입력하세요:자바
    //당신의 나이를 입력하세요:30
    //당신의 이름은 자바이고, 나이는 30살입니다



    public static void main(String[] args) {
//        ex1();
//        ex2();
//        ex3();
//        ex4();

//        ex5();
//        ex6();
//        ex7();
        ex9();
    }

    static void ex1() {
        System.out.println("ex1 start=====");
        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요:");
        String name = sc.nextLine();

        System.out.print("나이을 입력: ");
        int age = sc.nextInt();

        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "살입니다.");

        System.out.println("===== end ex1() ===== ");
    }


    static void ex2() {
        //
        System.out.println("Start ex2.... : 훌수 짝수");

        Scanner sc = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요:");
        int num = sc.nextInt();

        String evenNOdd = (num % 2 == 0) ? "짝수" : "홀수";

        System.out.println("입력한 숫자 " + num + "는 " + evenNOdd + "입니다.");

        System.out.println("==== End ex2 =====");
    }


    static void ex3() {
        //음식점 주문
        // foodName, foodPrice, foodQuantity 입력 : 총 가격 계산 출력
        // totalPrice
        //음식 이름을 입력해주세요: 피자
        //음식의 가격을 입력해주세요: 20000
        //음식의 수량을 입력해주세요: 2
        //피자 2개를 주문하셨습니다. 총 가격은 40000원입니다.
        System.out.println("Start ex3......");
        Scanner sc = new Scanner(System.in);

        System.out.print("음식 이름을 입력해주세요: ");
        String foodName = sc.nextLine();

        System.out.print("음식 가격을 입력해주세요: ");
        int foodPrice = sc.nextInt();

        System.out.print("음식 수량을 입력해주세요: ");
        int foodQuantity = sc.nextInt();

        int totalPrice = foodPrice * foodQuantity;

        System.out.println(foodName + " " + foodQuantity + "개를 주문하셨습니다. " +
            "총 가격은 " + totalPrice + "원입니다.");

    }

    static void ex4() {
        System.out.println("Start ex4 - 구구단");

        Scanner input = new Scanner(System.in);

        System.out.print("구구단의 단수를 입력해주세요: ");
        int n = input.nextInt();

        System.out.println(n + "단의 구구단:");

        for (int i = 1; i <= 9; i++) {
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }

    static void ex5() {
        int a = 20;
        int b = 10;
        System.out.printf("이전 : a=%d, b=%d\n", a, b);

        int tmp = b;
        b = a;
        a = tmp;

        System.out.printf("바꾼 문자 : a=%d, b=%d\n", a, b);
    }

    static void ex6() {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 수 입력:");
        int num1 = sc.nextInt();

        System.out.print("두번째 수 입력:");
        int num2 = sc.nextInt();


        if (num1 > num2) {
            int tmp = num2;
            num2 = num1;
            num1 = tmp;
        }

        StringBuffer sb = new StringBuffer();
        for (int i = num1; i <= num2; i++) {
            sb.append(i);
            if (i == num2) {
                continue;
            }
            sb.append(", ");
        }

        System.out.println("두 숫자 사이의 모든 정수:" + sb);
    }

    static void ex7() {

        Scanner sc = new Scanner(System.in);//루푸안에 선언하면
        //Scanner를 매 루프마다 생성하므로 메모리 낭비 및 자원 관리 측면에서 좋지 않음
        //보통 한번만 선언
        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료):");
            String name = sc.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = sc.nextInt();
            sc.nextLine(); // 숫자 입력 후 줄 바꿈
            //엔터(\n)는 읽지 않고 버퍼에 남겨둠
            //

            System.out.println("입력한 이름: "+ name +", 나이: " + age);

        }
    }


    static void ex8() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("상품의 가격을 입력하세요 (-1을 입력하면 종료): ");
            int price = sc.nextInt();

            if (price == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("구매하려는 수량을 입력하세요: ");
            int quantity = sc.nextInt();


            int totalCost = price * quantity;
            System.out.println("총 비용: " + totalCost);

        }
    }

    static void ex9() {
        //용자로부터 여러 개의 숫자를 입력 받고, 그 숫자들의 합계와 평균을 계산하는 프로그램을 작성하세요. 사용자
        //는 숫자를 입력하고, 마지막에는 -1을 입력하여 숫자 입력을 종료한다고 가정합니다.
        //모든 숫자의 입력이 끝난 후에는, 숫자들의 합계
        //계산해야 합니다.
        //다음 실행 결과 예시를 참고해주세요.
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");
        int sum = 0;
        int cnt = 0;
        int input = 0;
        while ((input = sc.nextInt()) != -1) {
            sum += input;
            cnt++;
        }

        double average = (double) sum / cnt;
        //Nan
        //todo

        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average );
    }

    static void ex10() {
        //상품 구매
        Scanner sc = new Scanner(System.in);
        int totalPrice = 0;
        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = sc.nextInt();

            if (option == 1) {
                sc.nextLine();
                System.out.print("상품명을 입력하세요: ");
                String name = sc.nextLine().trim();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = sc.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                int quantity = sc.nextInt();

                int coast = price * quantity;
                totalPrice += coast;
                System.out.println("상품명:" + name + " 가격:" + price + " 수량:"
                    + quantity + " 합계:" + coast);
            } else if (option == 2) {
                System.out.println("총 비용: " + totalPrice);
                totalPrice = 0;
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 옶션");
            } 




        }
    }


}
