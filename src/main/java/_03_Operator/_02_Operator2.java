package _03_Operator;

public class _02_Operator2 {
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

        // 6. 삼항연산자 -> 최종 값이 존재
        // boolean ? true일때 값 : false일떄 값
        int x = 5;
        int y = 3;

        // 둘 중 큰 값
        int max = x > y ? x : y;
        // ? 이후 데이터의 타입이 중요하다
        boolean isSame = x == y ? true : false;
        String sameStr = x == y ? "같습니다" : "다릅니다";

        // 중첩
        age = 17;
        String ticketName = age >= 20 ? "성인요금"
                : age >= 14 ? "청소년요금"
                : "어린이요금";

        // 실습) 키가 120 이상이면 "탑승가능", 아니라면 "탑승불가능"
        // 을 result에 대입해주세요
        String result;
        int height = 110;

        result = height > 120 ? "탑승가능" : "탑승불가능";

        System.out.println(result);

        // 실습2) 게시글 162개가 있을때
        // 한페이지에 20개씩 보인다면, 홈페이지 갯수를 pageCount에 대입
        // postCount를 바꾸어도 작동할 수 있게
        int postCount = 162;
        int pageCount;

        pageCount = postCount % 20 == 0 ? postCount / 20
                : (postCount / 20) + 1;

        System.out.println(pageCount);

    }
}
