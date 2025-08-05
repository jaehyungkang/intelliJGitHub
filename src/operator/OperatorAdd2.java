package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        // 전위 증감연산자
        b = ++a; // a의 값을 먼저 증가시키고, 그결과를 b에대입
        System.out.println("a = " + a + " b = " +b );

        //후위 증감 연산자 사용 예
        a = 1; //a값을 다시 1로지정
        b = 0; //b값을 다시 0으로 지정
        // 후위 증감연산자
        b = a++; // a의 값을 b에 먼저 대입하고 그 후 a 값을 증가시킴
        System.out.println("a = " + a + " b = " +b );

        // 본인 값만 증가시키는 경우는 차이가 없음.
    }
}
