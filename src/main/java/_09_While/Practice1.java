package _09_While;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // 1이상 101미만 정스 증에 하나를 랜덤하게 뽑기
        int randomNum = random.nextInt(1,101);
        System.out.println(randomNum);

        // 입력값보다 랜덤값이 크면 "Up" 출력
        // 입력값보다 랜덤값이 작으면 "Down" 출력
        // 같으면 "정답입니다!" 출력하고 찰출

        int myPick = 0;

        // 시행횟수 5를 넘어가면 탈출
        int count = 0; // 시행횟수
        //탈출 조건이 많으면 가독성 X
        while(true) {
            System.out.print("1에서 100사이 입력 > ");
            myPick = scanner.nextInt();
            // 입력값이 1~100 사이가 아니라면
            if (myPick <= 0 || myPick > 100) {
                System.out.println("1~100을 입력하세요");
                continue; // 다음 반복으로 스킵
            }
            count ++;

            if (count > 5) {
                // count가 6일때
                System.out.println("시행횟수 초과!");
                break;
            }

            if (myPick < randomNum) {
                System.out.println("Up");
            } else if (myPick > randomNum) {
                System.out.println("Down");
            } else {
                System.out.println("정답입니다!");
                break; // 가장 가까운 반복문 중괄호 탈출
            }
        } // 탈출
    }
}
