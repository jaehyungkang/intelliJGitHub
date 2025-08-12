package cond;

public class If5 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        // else if는 첫번째 if가 먹으면 그다음 실행안함
        if (price >= 10000) {
            discount  = discount +1000;
            System.out.println("10000원 이상 구매, 1000원 할인");

        }
        if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        }
        System.out.println("총 할인 금액: " +  discount + "원");
    }
}
