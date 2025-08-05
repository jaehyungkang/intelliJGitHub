package variable;

public class Var8 {
    public static void main(String[] args) {
        // 정수
        byte b = 127; // ~128 ~ 127 까지 담을수 있음
        short s = 32767; // ~32.768 ~ 32,767 까지 저장할 수 있음
        int i = 2147483647; // 대충 -+ 20억
        long l = 4384923483432432232L; // 졸라 김
        // 하지만 메모리 공간을 차지하지..

        //실수
        float f = 10.0f;
        double d = 242.3; // 훨씬 큰 범위의 실수를 쓸 수 있음
        // 정수 리터널은 범위까지만 표현 할 수 있다..
        // 기본적으로 double을 많이 쓴다. 계산이 제대로 안 될수 있음!..!
        // 실무에서 자주 쓰는것
        // int, long, String, boolean, double
        // 파일 전송에 byte를 사용하기도 함..!

    }
}
