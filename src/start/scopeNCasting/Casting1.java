package start.scopeNCasting;


public class Casting1 {

    public static void main(String[] args) {
        int intValue = 10;
        long longValue = intValue;
        double doubleValue = longValue;
        //작은 범위 숫자 타입에서 큰 범위 숫자 타입으로의 대입은 개발자가 이렇게 직접 형변환을 하지 않아도 된다
        //자동 형변환, 묵시적 형변환

        //명시적 형변환(큰 -> 작은)
        doubleValue = 1.5;
        intValue = 0;
//        intValue = doubleValue; //컴파일 오류
        intValue = (int) doubleValue;
        System.out.println(intValue); //1

    }
}
