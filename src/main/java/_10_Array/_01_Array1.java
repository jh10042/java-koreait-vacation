package _10_Array;

public class _01_Array1 {
    public static void main(String[] args) {
        // 배열(Array): 동일한 자료형에 많은 데이터를 한번에 관리하는 자료형
        // 연속된 공간(메모리)에 위치하기 때문에 조회시 유리

        // 배열 생성 방법
        // 1. 자료형[] 변수명 = new 자료형[공간갯수];
        // new -> 참조자료형
        int[] scores = new int[5]; // 자리만 만든 상태
        scores[0] = 90;
        scores[1] = 80;

        // 2. 초기화까지 한 줄
        int[] scores2 = new int[]{90, 80, 40, 60, 100};
        System.out.println(scores2[0]);
        System.out.println(scores2[1]);
        // new 생략 버전
        int[] scores3 = {90, 80, 40, 60, 100};

        // 매열의 속성
        // 배열의 칸 개수(길이): 배열.length
        System.out.println(scores3.length);

        String[] names = {"홍길동", "김길동", "박길동", "이길동", "서길동"};
        // for문으로 전체 순회
        // 전형적인 배열의 순회 방식
        for(int i = 0; i < names.length; i++) {
            String name= names[i];
            System.out.println("이름: " + name);
        }

        // 향상된 for문
        for(String name : names) {
            System.out.println("이름: " + name);
        }
        // 인덱스 덩보는 숨겨져 있음
        // 인덱스로 데이터에 직접접근하는 코드를 막는다

        // 향상된 for문을 사용하여
        // 1. scores3의 평균점수를 구해 주세요
        // 2. 평균이상 점수의 개수
        // 3. 최고점수

        // 실습 1)
        int sum = 0;
        for (int score : scores3) {
            sum += score;
        }
        System.out.println(sum/scores3.length);

        // 실습 2)
        int avg = sum/scores3.length;
        int count=0;
        for (int score : scores3) {
            if (score > avg) {
                count ++;
            }
        }
        System.out.println(count);

        // 실습 3)
        int max = 0;
        for (int score: scores3) {
            if (score > max) {
                max = score;
            }
        }
        System.out.println(max);

    }
}
