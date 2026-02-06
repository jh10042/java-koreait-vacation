package _12_Class;

public class _02_PostMAin {
    public static void main(String[] args) {
        // post 객체 생성
        Post p1 = new Post(); // 필드값 초기화 X
        // 주소에 직접 대입
        p1.title = "페이커 멋있다";
        p1.content = "은퇴 안해도 될듯";

        Post p2 = new Post("점멸 뺴도 됨?", "명상 넣고 싶은데", "익명3", 204);

        p2.printCount();
    }
}
