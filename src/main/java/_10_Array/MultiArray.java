package _10_Array;

public class MultiArray {
    public static void main(String[] args) {
        // 다중 배열
        // 이중 배열
        String[] seatA = {"A1", "A2", "A3"}; // 0X1000
        String[] seatB = {"B1", "B2", "B3"}; // 0X1000
        String[] seatC = {"C1", "C2", "C3"}; // 0X1000

        // seats 배열이 뭘 저장하고 있는 걸끼?
        // seats도 0X5000
        // String[] -> String 저장하는 배역
        // String[][] -> String [] 저장하는 배열
        String[][] seats = {seatA, seatB, seatC};
        String[] bseat = seats[1]; // 0X2000
        String B2 = bseat[1]; // 0X2000에서 한 칸 더

        // 0X5000에서 1번칸, 1번칸 주소로 가서
        String b2 = seats[1][1];

        // seats로 시작하여 A3, C1를 읽어와 출력!
        String A3 = seats[0][2];
        String C1 = seats[2][0];
    }
}
