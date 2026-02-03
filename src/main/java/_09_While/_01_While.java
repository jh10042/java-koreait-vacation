package _09_While;

import java.util.Scanner;

public class _01_While {
    public static void main(String[] args) {

        int count = 0; // 외부 변수
        boolean flag = true;
        while (flag) { // 탈출 조건
            count++; // 탈출 조건을 조작하는 코드
            System.out.println("현재 count: " + count);
            if (count == 5) {
                flag = false;
            }

            /*
                while(조건식) {
                    // 조건식이 참인 동안 반복될 코드
                } // 조건식 결과가 false가 되면 탈출

                for 문 - "횟수"가 명확할 때
                while문 - "조건"이 명확할 때
             */
        }

        // 실습) 1부터 1씩 증가하는 수를 누적합 하는데
        // sum이 1000이 넘어가면 탈출하는 while문
        int sum = 0; // 누적합해줄 변수
        int num = 0; // 반복때 1씩 증가할 변수
        while (sum <= 1000 && num <= 100) {
            num ++;
            sum += num;
        }
        System.out.println(sum);

        Scanner scanner = new Scanner(System.in);

        boolean isLogin = true; // flag
        while (isLogin) {
            System.out.println("로그인 상태입니다");

            System.out.println("로그아웃 하시겠습니까? (y/n)");
            String choice = scanner.nextLine();
            if (choice.equals("y")) {
                isLogin = false;
            }

            // do-while문: (실행 -> 조건확인) X N -> 탈출
            // while문: (조건확인 -> 실행) X N -> 탈출

            int x = 10;
            do {
                System.out.println("실행될걸요?");
            } while (x < 5);
        }
    }
}
