package _01_Print;

//주석: 사람이 읽으라고 만든 메모
/*
1. 자바는 객체지향언어 -> class 위주의 설계, 메모리, 기능
2. 자바코드가 실행되는 과정
.java(우리가 작성한 코드) -> 컴파일과정 -> .class(바이트코드)
-> JVM(자바가상머신)이 읽고 실행 - > OS(윈도우, 맥)호출 -> 출력
 */
public class _01_HelloJava {// 클래스 정의 시작
    // 메인메서드
    // main이라는 현관문을 통해 외부와 출입
    // 프로그램을 실행시 JVM은 main을 실행한다.
    public static void main(String[] args) {// 메인 시작
        System.out.println("Hello world!");

        /*
        이름: 깁정훈
        나이: 21
        주소: 부산광역시 남구
         */

        System.out.println("이름: 김정훈");
        System.out.println("나이: 21");
        System.out.println("주소: 부산광역시 남구");
    }// 메인 끝

}// 클래스 정의 끝
