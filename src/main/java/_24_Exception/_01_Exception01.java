package _24_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _01_Exception01 {
    public static void main(String[] args) {






        String[] colors = {"pink", "red", "black", "white", "blue"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("색상을 골라주세요(0~4) > ");
        try{
            int pickNum = scanner.nextInt();
            String pickColor = colors[pickNum];
            System.out.println("고르신 색상: " + pickColor);
        } catch (ArrayIndexOutOfBoundsException e) {
            // JVM이 들고다니던 예외객체를 e 매개변수에 대입해줌
            System.out.println("0~4를 입력하십시오");
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("숫자만 입력하십시오");
        } catch (Exception e) {
            System.out.println("정상적인 값을 입력하십시오");
        } finally {
            scanner.close();
        }

    }
}
