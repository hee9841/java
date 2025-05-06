package start.array;

import java.util.Scanner;

public class ProductAdminEx {

    //상품 등록: 상품 이름, 가격 입력 받아 저장
    //상품 목록 : 지금 까지 등록한 상품의 목록을 출력

    //  "1. 상품 등록", "2. 상품 목록", "3. 종료"
    // 1 : 사용자로 부터 상품 이름과 가격을 입력해 배열 저장
    //2 : 배열에 저장된 모든 상품을 출력
    // 3. 종료
    // 상품은 최대 10개 까지 등록 가능


    public static void main(String[] args) {
        ProductEx productEx = new ProductEx();
        productEx.process();

    }

    public static class ProductEx {
        private final int maxCnt = 10;
        private Scanner sc = new Scanner(System.in);

        private String[] productNames = new String[10];
        private int[] productPrices = new int[10];
        private int productCount = 0;


        public void process() {
            while (true) {
                System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
                System.out.print("메뉴를 선택하세요:");

                int option = sc.nextInt();
                sc.nextLine();
                switch (option) {
                    case 1 -> register();
                    case 2 -> show();
                    case 3 -> {
                        System.out.println("프로그램을 종료합니다");
                        return;
                    }
                    default -> System.out.println("잘못된 옵션입니다.");
                }
            }
        }

        private void register() {
            if (productCount >= maxCnt) {
                System.out.println("더 이상 상품을 등록할 수 없습니다.");
                return;
            }

            System.out.print("상품 이름을 입력하세요: ");
            productNames[productCount] = sc.nextLine();

            System.out.print("상품 가격을 입력하세요: ");
            productPrices[productCount] = sc.nextInt();

            productCount++;
        }

        private void show() {
            if (productCount == 0) {
                System.out.println("등록된 상품이 없습니다.");
                return;
            }

            for (int i = 0; i < productCount; i++) {
                System.out.println(productNames[i] + " : " + productPrices[i] + "원");
            }

        }
    }

}
