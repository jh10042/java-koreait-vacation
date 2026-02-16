package _03_Operator;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 연산자: 계산을 수행하는 기호
        // 3 + 4: "+" -> 연산자, 3,4 -> 피연산자
        // a + b : 변수(a,b)들도 피연산자 가능

        // 1. 산술연산자(+,-,*,/,%)
        int num1 = 3;
        int num2 = 2;
        // int끼리의 나눗셈은 몫만 출력됨
        System.out.println(num1/num2);
        // 나머지연산 - 3 / 2 ... 나눈 나머지 "1"
        System.out.println(num1 % num2);

        // 2. 비교연산자 - 결과값이 boolean 타입
        System.out.println(num1 == num2); // 같은가?
        System.out.println(num1 != num2); // 다른가?
        // 대소비교 - 피연산자는 2개
        System.out.println(num2 > 0); // 0 초과?
        System.out.println(num2 < 0); // 0 미만?
        System.out.println(num2 >= 0); // 0 이상?
        System.out.println(num2 <= 0); // 0 이하?

        //짝수 판단
        System.out.println(num2 % 2 == 0);

        // 22시에서 50시간을 더한 시각?
        int now = 22;
        int after50h = (now +50) % 24;
        System.out.println(after50h);

        // 게시글 162개 존재
        // 한페이지당 20개씩 보여져야 함
        // 총 몇페이지를 보여줘야 하나요?

        int postsCount = 162;
        int viewCount = 20;
        int result = postsCount % viewCount;
        // result == 0이면 총 페이지: postsCOunt / viewCount
        // result != 0이면 총 페이지: postsCOunt / viewCount + 1

        // 3. 단항연산자
        int a = 1;
        // 후위 증감
        int b = a++; // 사용(대입) 후에 1 증가시켜라
        System.out.println(b); // 1
        // 전위 증감;
        a = 1;
        b= ++a; // 사용(대입)전에 1 증가시켜라
        System.out.println(b); // 2
        // 감소도 동일: a--, --a 등
        // 단독 사용시 작동 결과는 동일

        // 4. 대입연산자
        a = 5;
        // 우변 먼저 연산하고, 최종 대입
        a = a + 3;
        // a의 값을 3 증가 시켰따
        a += 3; // 위와 동일한 연산
        // -, *, /, % 도 동일
    }
}
