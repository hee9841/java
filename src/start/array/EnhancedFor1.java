package start.array;

public class EnhancedFor1 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};

        //향상된 for
        for (int number : numbers) {
            System.out.println(number);
        }

        //for-each를 사용 못하는 경우는 index 필요
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number " + i + "번쨰 결과: " + numbers[i]);
        }

    }

}
