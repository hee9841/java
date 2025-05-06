package start.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx {

    public static void main(String[] args) {
        ex8();
    }

    static void ex1() {
        int[] students = {90, 80, 70, 60, 50};

        int total = Arrays.stream(students).sum();
        double average = (double) total / students.length;

        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);

    }

    static void ex2() {
        System.out.println("5개 정수 입력:");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("출력: ");

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i != arr.length - 1) {
                sb.append(", ");
            }
        }

        System.out.println(sb);
    }

    static void ex3() {
        System.out.println("5개 정수 입력:");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("역순 출력: ");

        StringBuffer sb = new StringBuffer();


        for (int i = arr.length -1 ; i >= 0; i--) {
            sb.append(arr[i]);
            if (i != 0) {
                sb.append(", ");
            }
        }

        System.out.println(sb);
    }

    static void ex4() {
        System.out.println("5개 정수 입력:");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("입력한 정수의 합계: " + Arrays.stream(arr).sum());
        System.out.println("입력한 정수의 평계: " + Arrays.stream(arr).average().getAsDouble());

    }


    static void ex5() {
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n + "개의 정수를 입력하세요:");

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("입력한 정수의 합계: " + Arrays.stream(arr).sum());
        System.out.println("입력한 정수의 평계: " + Arrays.stream(arr).average().getAsDouble());

    }


    static void ex6() {
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n + "개의 정수를 입력하세요:");

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("가장 작은 정수: " + Arrays.stream(arr).min().getAsInt());
        System.out.println("가장 큰 정수: " + Arrays.stream(arr).max().getAsInt());

    }

    static void ex7() {

        int[][] scores = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");

            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + " 점수:");
                scores[i][j] = sc.nextInt();
            }

        }

        for (int i = 0; i < 4; i++) {
            int sum = Arrays.stream(scores[i]).sum();
            double avg = (double) sum / 3;
            System.out.println((i + 1) + "번 학생의 총점: " + sum + ", 평균: " + avg);
        }


    }


    static void ex8() {

        String[] subjects = {"국어", "영어", "수학"};

        System.out.print("학생수를 입력하세요: ");

        Scanner sc = new Scanner(System.in);
        int stuCnt = sc.nextInt();
        int[][] scores = new int[stuCnt][3];
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");

            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + " 점수:");
                scores[i][j] = sc.nextInt();
            }

        }

        for (int i = 0; i < scores.length; i++) {
            int sum = Arrays.stream(scores[i]).sum();
            double avg = (double) sum / 3;
            System.out.println((i + 1) + "번 학생의 총점: " + sum + ", 평균: " + avg);
        }


    }
}
