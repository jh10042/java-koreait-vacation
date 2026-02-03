package _08_For;

public class _01_For {
    public static void main(String[] args) {
        // 반복문- for
        /*
            for (변수 선언; 조건식; 증감식) {
                 // 반복실행될 코드
             }
         */

        // 변수선언(초기식): for 문안에서 쓸 변수를 선언
        // 조건식: false면 탈출
        // 증감식: 변수조작
        // 초기식 -> (조건식 -> 코드실행 -> 증감식) X N -> 조건식이 false일때 탈출
        for (int i = 0; i < 10; i++) {
            System.out.println("현재 숫자: " + i);
        }

        int a = 1;
        for(; a < 6; a++){
            System.out.println("현재 a: " + a);
        }
        System.out.println(a); // 6

        // 1단계) 1~10까지 출력
        // 2단계) 1~10 중 짝수만 출력
        // 3단계) 1~100까지 합한 값 출력
        // 4단계) 1~100까지 수 중에서 3의 배수, 5의 배수 각각 갯수 출력

        // 1단계
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        // 2단계
        for (int j = 1; j < 11; j++) {
            if (j % 2 == 0){
                System.out.println(j);
            }
        }

        // 3단계
        int sum = 0;
        for (int k = 1; k < 101; k++) {
            sum += k;
        }
        System.out.println(sum);

        // 4단계
        int multiple3 = 0;
        int multiple5 = 0;

        for (int l =1; l <101; l++) {
            if (l % 3 == 0) {
                multiple3 += 1;
            }
            if (l % 5 == 0) {
                multiple5 += 1;
            }
        }

        System.out.println("3의 배수의 개수: " + multiple3);
        System.out.println("5의 배수의 개수: " + multiple5);
    }
}
