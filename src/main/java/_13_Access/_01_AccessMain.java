package _13_Access;

public class _01_AccessMain {
    public static void main(String[] args) {
        Access a1 = new Access("데이터");
        // a1.data ="000"; data가 private이기 때문에 불가능
        a1.setData(""); // 검증된값만 들어가도록
        a1.setData("000"); // ok

        // WaterBottle 객체 생성
        WaterBottle w1 = new WaterBottle(); // 100
        w1.drink(120); // 100
        w1.drink(80); // 20
        w1.fill(1200); // 20
        w1.fill(500); // 520
        w1.drink(100); // 420

        WaterBottle w2 = new WaterBottle(); // 100
        w2.drink(40); // 60
        w2.drink(100); // 60
        // -> 각 객체가 가진 값마다 서로 다륵 동작
        // 객체지향 프로그래밍

        // private라서 호출 불가
        // w1.ispositive(100);
    }
}
