package _09_While;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        // 문자열 ""
        String ex = "";
        // isEmpty -> 빈문자열("") 검사
        // isBlank -> 빈문자열 스페이스바, 엔터 공백 검사


        Scanner scanner = new Scanner(System.in);
        String password = "1q2w3e4r";

        // 비밀번호를 입력받아주세요
        // 입력이 비어있으면, "다시 입력하세요" (시도횟수 증가 X)
        // 비밀번호를 틀리면 다시입력 받게 (시도횟수 ++)
        // 최대 5회 시도 가능, 5회에 도달하면 "계정락" 탈출

        String myPick;
        int chance = 5;

        System.out.println("남은 시도 횟수: 5번");
        while (true) {
            System.out.print("비밀번호 입력 >> ");
            myPick = scanner.nextLine();

            if (myPick.equals(ex)) {
                System.out.println("다시 입력하세요");
                continue;
            }

            if (myPick.equals(password)) {
                System.out.println("로그인성공!");
                break;
            } else {
                chance --;
                if(chance > 0) {
                    System.out.println("다시 입력하세요");
                    System.out.println("남은 시도횟수: " + chance);
                }
            }
            if (chance < 1) {
                System.out.println("계정락");
                break;
            }

        }

    }
}
