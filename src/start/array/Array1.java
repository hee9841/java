package start.array;


public class Array1 {

    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[5]; //배열 생성 : 배열 사용을 위해, 5개의 공간은 0으로 초기화
        // 3. 배열 참조값 보관 : 배열을 생성하면 값을 참조할 수 있는 참조값(주소값)을 보관
        // int[] students는 new int[5]을 참조하는 값을 가지고 있음
        //int[] students = new int[5]; //1. 배열 생성
        //int[] students = x001; //2. new int[5]의 결과로 x001 참조값 반환
        //students = x001 //3. 최종 결과


        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + i+1 + "점수: " + students[i]);
        }

        System.out.println("students = " + students);   //[I@7699a589

        //======
        // 인덱스
        //students는 0부터 시작,
        // 기본형 vs 참조형
        //- 기본형(Primitive Type) : int, long, double, boolean... 변수에 값을
        // 직접 넣ㅇ르 수 있는 데이터 타입
        // - 참조형(Reference Type) : 기본형 제외하고, 주소 값을 저장하는 데이터

        //==== refactoring ====
        // int[] students1 = new int[]{90, 80, 70, 60, 50}; //배열 생성과 동시에 초기화
        int[] students1 = {90, 80, 70, 60, 50}; //배열 생성과 동시에 초기화

        for (int i = 0; i < students1.length; i++) {
            System.out.println("학생" + i+1 + "점수: " + students1[i]);
        }

    }
}
