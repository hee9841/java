package start.cond;


public class CondEx {

    public static void main(String[] args) {
//        ex1(95);
//        ex1(85);
//        ex1(75);
//        ex1(65);
//        ex1(55);

//        ex2(1);
//        ex2(5);
//        ex2(25);
//        ex2(150);

//        ex6(10, 20);
        ex7(10);
        ex7(3);
    }

    static void ex1(int score) {
        String grade;
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("score:" + score);
        System.out.println("학점은 " + grade + "입니다.");
        System.out.println();
    }

    static void ex2(int distanceKm) {
        //주어진 거리에 따라 가장 적합한 운송 수단을 선택하는 프로그램을 작성하자. 다음과 같은 기준을 따른다.
        //거리가 1km 이하이면: "도보"
        //거리가 10km 이하이면: "자전거"
        //거리가 100km 이하이면: "자동차"
        //거리가 100km 초과이면: "비행기

        String transport;
        if (distanceKm <= 1) {
            transport = "보도";
        } else if (distanceKm <= 10) {
            transport = "자전거";
        } else if (distanceKm <= 100) {
            transport = "자동차";
        } else {
            transport = "비행기";
        }

        System.out.println();
        System.out.println("distance: " + distanceKm);
        System.out.println(transport + "를 이용하세요");
    }

    static void ex3(int dollar) {
        //환율 계산기
        // dollar 0 미만 "잘못된 금액"
        // 0 : 환전할 금액이 없ㅇ므
        // 초가 : 환점 금액은 ...원입ㄴ티다.
        if (dollar < 0) {
            System.out.println("잘못된 금액");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없음");
        } else {
            int won = dollar * 1300;
            System.out.println("환전 금액은 " + won + "원입니다.");
        }
    }

    static void ex4(double rating) {
        if (rating >= 9) {
            System.out.println("'어바웃타임'을 추천합니다");
        }

        if (rating >= 8) {
            System.out.println("'토이 스토리'를 추천합니다.");
        }

        if (rating >= 7) {
            System.out.println("'고질라'를 추천합니다.");
        }
    }

    static void ex5(String grade) {
        switch (grade) {
            case "A" -> System.out.println("탁월한 성과입니다!");
            case "B" -> System.out.println("좋은 성과입니다!");
            case "C" -> System.out.println("준수한 성과입니다!");
            case "D" -> System.out.println("향상이 필요합니다.");
            case "F" -> System.out.println("불합격입니다.");
            default -> System.out.println("잘못된 학점입니다.");
        }
    }

    static void ex6(int a, int b) {
        System.out.println("더 큰 숫자는 " + ((a > b) ? a : b) + "입니다.");
    }
    
    static void ex7(int x) {
        System.out.println("x = " + x + ", " + ((x % 2) == 0 ? "짝수" : "홀수"));
    }
}
