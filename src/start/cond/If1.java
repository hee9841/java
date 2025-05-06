package start.cond;


public class If1 {

    public static void main(String[] args) {
        ifCod1(18);
        ifCod2(18);
        ifCond2(14);
        ex5(10, 10000);

    }

    static void ifCod1(int age) {
        if (age >= 18) {
            System.out.println("성인");
        }

        if (age < 18) {
            System.out.println("미성년");
        }
    }

    static void ifCod2(int age) {
        if (age >= 18) {
            System.out.println("성인");
        } else {
            System.out.println("미성년");
        }
    }

    static void ifCond2(int age) {
        String ageCate;
        if (age <= 7) {
            ageCate = "미취학";
        } else if (age <= 13) {
            ageCate = "초등학생";
        } else if (age <= 16) {
            ageCate = "중학생";
        } else if (age <= 19) {
            ageCate = "고등학생";
        } else {
            ageCate = "성인";
        }
        System.out.println(ageCate);
    }

    static void ex5(int age, int price) {
        //온라인 쇼핑몰의 할인 시스템을 개발해야 한다. 한 사용자가 어떤 상품을 구매할 때, 다양한 할인 조건에 따라 총 할인
        //금액이 달라질 수 있다.
        //각각의 할인 조건은 다음과 같다.

        //아이템 가격이 10000원 이상일 때, 1000원 할인
        //나이가 10살 이하일 때 1000원 할인

        //한 사용자가 동시에 여러 할인을 받을 수 있다는 점
        int discount = 0;
        if (age <= 10) {
            System.out.println("어린이 1000원 할인");
            discount += 1000;
        }

        if (price >= 10_000) {
            System.out.println("10000원 이상 구매, 1000원 할인");
            discount += 1000;
        }

        System.out.println("총 할인 금액 : " + discount + "원");
    }
}
