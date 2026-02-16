package _11_Method;

public class _03_Practice1 {
    // 1. 숫자 하나를 매개변수로 전달받음
    // 전달받은 숫자가 짝수면 true, 홀수면 false 리턴
    // 이름: isEven

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true; // 리턴만나면 매서드 즉시 종료
        }

        return false;

    }

    // 2. int[] nums, int num을 매개변수로 전달받음
    // num이 nums에 존재하는 숫자인지?
    // 존재하면 true, 안하면 false 라턴

    public static boolean numInNums(int[] nums, int num) {
        for (int n : nums) {
            if (n == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean result = isEven(4);
        System.out.println(result);

        int[] nums = {1,2,3,4};
        boolean result2 = numInNums(nums,3);
        System.out.println("결과: " + result2);
    }
}
