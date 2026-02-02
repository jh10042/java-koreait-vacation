package _10_Array;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        // 참조자료형의 특징 - "."으로 참조 가능
        // 실제값들은 heap에 저장되어 있다
        // 배열 또한 참조자료형

        /*
            stack: 고정된 크기, 작음, JVM이 빠르게 접근
            heap: 유동적 크기, 큼, JVM이 상대적으로 느리게 접근

            -main stack-
            a: 10
            original: 0X1000 (heap 메모리주소)
            -heap-
            0X1000: 1
            0X1004: 2
            0X1008: 3
         */
        int[] original = {1,2,3};

        // 대입연산은 stack의 값을 복사해서 가져감

        /*
            -main stack-
            a: 10
            original: 0X1000 (heap 메모리주소)
            copy1:0X1000 <- 대입연산 결과
            -heap-
            0X1000: 1
            0X1004: 2
            0X1008: 3
         */
        int[] copy1 = original; // 대입
        System.out.println(original[0]); // 1
        System.out.println(copy1); // 1

        /*
            -main stack-
            a: 10
            original: 0X1000 (heap 메모리주소)
            copy1:0X1000 <- 대입연산 결과
            -heap-
            0X1000: 1 -> 999 수정
            0X1004: 2
            0X1008: 3
            0X2000: 999
            0X2004: 2
            0X2008: 3

        */

        original[0] = 999; // 오리지날의 0번을 999로 수정
        System.out.println(original[0]); // 999
        System.out.println(copy1); // 999?

        // heap에 새로운 메모리를 할당하야 실제값을 복사해 가라
        // 깊은 복사
        int[] copy2 = Arrays.copyOf(original, original.length);
        // 배열 그 자체가 출력
        System.out.println(copy2);
        // 배열 내부 값을 문자열로 출력
        System.out.println(Arrays.toString(copy2));

    }
}
