package start.array;

public class ArrayDi0 {

    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        arr[0][0] = 1; //0행, 0열
        arr[0][1] = 2; //0행, 1열
        arr[0][2] = 3; //0행, 2열
        arr[1][0] = 4; //1행, 0열
        arr[1][1] = 5; //1행, 1열
        arr[1][2] = 6; //1행, 2열

        for (int[] rows : arr) {
            for (int num : rows) {
                System.out.print(num+ " ");
            }
            System.out.println();
        }

        //== refactoring ==
        int[][] arr1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        for (int[] rows : arr1) {
            for (int num : rows) {
                System.out.print(num+ " ");
            }
            System.out.println();
        }

        //== refactoring2 값 입력 ==
        int[][] arr2 = new int[2][3];

        int i = 1;
        for (int row = 0; row < arr2.length; row++) {
            for (int col = 0; col < arr2[row].length; col++) {
                arr2[row][col] = i++;
            }
        }

        for (int[] rows : arr1) {
            for (int num : rows) {
                System.out.print(num+ " ");
            }
            System.out.println();
        }
    }

}
