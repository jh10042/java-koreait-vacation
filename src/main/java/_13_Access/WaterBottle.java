package _13_Access;

public class WaterBottle {
    private int currentWater = 100; // 현재 물컵에 있는 물 양

    public int getCurrentWater() {
        System.out.println("현재 물양: " + currentWater);
        return currentWater;
    }

    // 물을 채우는 매서드 - amount + currentWater
    // 1. amount가 음수 X
    // 2. 총량(1000mL) 넘으면 X
    // 3. 물을 채웠습니다 출력
    public void fill(int amount){
        if (amount < 0) {
            System.out.println("물은 음수X");
            return;
        }
        if (currentWater + amount > 1000) {
            System.out.println("물이 넘칩니다");
            return;
        }
        // fill 아니면 물의 양 증가 불가능
        this.currentWater += amount;
        System.out.println("물을 채웠습니다");
    }

    // 물을 마시는 메서드 - amount - currentWater
    // 1. amount가 음수 X
    // 2. 현재 물의 양보다 더 많이 마실 수 X
    // 3. 물을 마셨습니다 출력
    public void drink(int amount){
        // private 메서드는 클래스내 다른 메서드에서 호출 ok
        if (isPositive(amount)) {
            System.out.println("물은 음수X");
            return;
        }
        if (currentWater < amount) {
            System.out.println("현재 양보다 많이 X");
            return;
        }
        this.currentWater -= amount;
        System.out.println("물을 마셨습니다");
    }

    // private 메서드 -> 외부(main)에서 호출불가
    private boolean isPositive(int amount) {
        return amount > 0;
    }
}
