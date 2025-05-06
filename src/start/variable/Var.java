package start.variable;

public class Var {
    public class Var2 {
        static void var() {
            System.out.println("var1");
            //값을 저장하고 꺼내서 볼수 있는 저장소, 그릇이라고 생각
            //그래서 변수(start.variable) : 변할 수 있는 숫자
            int a; // 변수 선언 (int, flat double 최기화 값, String -> null : 이거 학습)
            a = 10; //변수 대입, 초기화
            System.out.println(a);
        }
    }

    public class Var3 {
        static void var() {
            System.out.println("var3 변수 값 변경");
            int a = 10;
            System.out.println(a);
            a = 50;
            System.out.println("값 변경 :" + a);
        }
    }

    public class Var4_5 {
        static void var() {
            System.out.println("var4 선언 초기화");
            int a;
            int b;
            int c,d;

            //선언 후 처음 정의 하는것을 초기화
            int e;
            e = 1; // 변수 선언 후 초기화

            int f =1; //변수 선언과 초기화를 한번에
        }
    }

    public class Var6 {
        static void var() {
            //변수를 초기화를 꼮 해야함
            System.out.println("var6: 최기화 이유");
            int a;
//            System.out.println(a);

            //java: start.variable a might not have been initialized -> 컴파일 에러
            // 지역변수는 직접 초기화!, 클래스, 인스턴스 변수 등은 자바가 나중에 자동으로 초기화해줌 -> 이부분 학습
            // Executing pre-compile tasks…
            // Errors occurred while compiling module 'java-start'
            // 컴파일러가 에러를 찾아내는 거임
        }
    }
    
    public class Var7 {
        static void varType1() {
            System.out.println("var7 변수 타입");
            int i = 100; //정수
            double d = 10.5; //실수
            boolean b = true; // 블리언,
            char c = 'A';   //문자 하나
            String str = "문자열";

            System.out.println(i);
            System.out.println(d);
            System.out.println(b);
            System.out.println(c);
            System.out.println(str);

        }

        static void varType2() {
            //1. 정수
            byte b = 127; //-128~127
            short s = 32767; // -32768 ~ 32767
            int i = 2147483647; //-2,147,483,648 ~ 2,147,483,647 (약 20억)

            //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
            long l = 9223372036854775807L;

            //2. 실수
            float f = 10.0f;
            double d = 10.0; //기본으로 실무에서 사용

            //메모리를 많이 사용하면 큰 숫자 표현, 변수 선언하면 표현 범위에 따라 메모리 공간을 차지함. 그래서 필요에 맞도록 다양한 타입 제공

            //그럼 뭘??
            // 다음 타입은 거이 실무에서 사용X
            // byte, short, float(정밀도 낮아서 double 사용), char

            // 자주 사용
            // 정수 : int, long
            //      - 대신 파일 다룰 때는 byte
            // 실수 : double
            // 불린
            // 문자열
        }
    }

    public class ExampleVar {

        public void ex3() {
            long l = 10000000000L;
            System.out.println(l);
        }

    }


    public static void main(String[] args) {
        Var.Var7.varType1();
    }

}
