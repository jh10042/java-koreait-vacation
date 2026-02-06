package _13_Access;

public class Access {
    /*
        접근제어자 - (클래스), 메서드, 필드 모두 동일하게 적용
        데이터 보호목적: 주소로 직접 참조(.) 막기 위해

        종류
        1. public: 어디서든 . 가능
        2. protected: 같은 패티지 && 상속관계 일떄만 . 가능
        3. default: 같은 페키지만 . 가능
        4. private: 클래스 내부가 아니면 . 불가능
     */

    // 대부분의 경우 필드는 private
    private String data;

    public Access(String data) {
        this.data = data;
    }

    // setter - set 필드 메인
    public void setData(String data) {
        // 검증하는 코드
        if(data.isEmpty()) {
            System.out.println("비어있으면 X");
            return;
        }

        if(data.startsWith("박")) {
            System.out.println("박으로 시작하는 건 X");
            return;
        }
        this.data = data;
    }

}
