public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int replenishment = 1200;
        int bonus = replenishment / 100;
        int sum = balance + replenishment;
        if (replenishment < 1001) {
            bonus = 0;
        }
        System.out.println(bonus);
        System.out.println(sum);
    }
}

