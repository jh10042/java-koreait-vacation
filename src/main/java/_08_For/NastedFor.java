package _08_For;

public class NastedFor {
    public static void main(String[] args) {
        // 2중 for문

        // 일주일
        for(int day = 1; day <= 7; day++) {
            System.out.println(day + "일 실았습니다");
        } // 일주일 for문 전체를 일주일로 치환해서 생각가능

        // 한달
        // 바깥 반복이 한번 돌때 안쪽 반복이 전체 반복
        for (int week = 1; week <= 4; week++) {
            System.out.println(week + "주 시작!");
            for(int day = 1; day <= 7; day++) {
                System.out.println("\t" + day + "일 실았습니다");
            }
            System.out.println(week + "주 끝!");
        }

        // 구구단
        /*
            2단 시작!
                2X1 =2
                ..
            3단 시작!
            ..
            9단 끝!
         */

        for (int dan = 1; dan <= 9; dan++) {
            System.out.println(dan + "단 시작!");
            for (int number = 2; number <= 9; number++) {
                System.out.println(dan + "X" + number + "=" + dan * number);
            }
            System.out.println(dan + "단 끝!");
        }
    }
}
