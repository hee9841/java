package start.scanner;


import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
//        ex1();
//        ex3();
//        whileEx1();
        whileEx2();
    }

    static void whileEx2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자와 두번째 숫자가 모듀 0이면 프로그램 종료");

        while (true) {
            System.out.print("첫번째 숫자: ");
            int first = sc.nextInt();

            System.out.print("두번째 숫자: ");
            int second = sc.nextInt();

            if (first == 0 && second == 0) {
                System.out.println("exit Program");
                break;
            }

            if (first == second) {
                System.out.println("두 숫자 같음");
                continue;
            }

            System.out.println("큰 숫자 : " + (Math.max(first, second)));
        }
    }

    static void whileEx1() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("문자열 입력(exit: 종료):");
            String str = sc.nextLine();

            if (str.trim().equalsIgnoreCase("exit")) {
                System.out.println("program exit");
                break;
            }

            System.out.println("입력 문자열 : " + str);

        }
    }

    static void ex1() {
        //System.in을 통해 받을 수 있음
        //스케너로 받을 수 있
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열 입력: ");
        String str = scanner.nextLine();
        System.out.println("입력한 문자열 : " + str);

        System.out.print("정수 입력: ");
        int intVal = scanner.nextInt();
        System.out.println("입력한 정수 : " + intVal);

        System.out.print("실수 입력: ");
        double doubleVal = scanner.nextDouble();
        System.out.println("입력한 실수 : " + doubleVal);

    }

    static void ex3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 정수 입력 : ");
        int firstInt = sc.nextInt();

        System.out.print("두번째 정수 입력 : ");
        int secondInt = sc.nextInt();

        if (firstInt == secondInt) {
            System.out.println("두 숫자는 같음");
            return;
        }

        System.out.println("더 큰 숫자 : " + (Math.max(firstInt, secondInt)));
    }
}
