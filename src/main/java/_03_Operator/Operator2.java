package _03_Operator;

public class Operator2 {
    public static void main(String[] args) {
        // 5. 논리연산자 - boolean 타입끼리 연산
        // 결과타입: boolean
        // 운전 가능?
        boolean hasLicense = true;
        int age = 25;

        // and 연산자(&&): 둘 다 true일때 true
        boolean canDrive
                = hasLicense && (age >= 20);

        // or 연산자(||): 둘 중 하나라도 true면 true
        boolean isWeekend = false;
        boolean isHoliday = true;
        boolean isRest = isHoliday || isWeekend;

        // not 연산자(!): boolean값을 반전
        boolean isOnline = true;
        boolean isOffline = !isOnline;

        // 6. 삼항연산자
        // boolean ? true일때 값 : false일떄 값
        int x = 5;
        int y = 3;

    }
}
