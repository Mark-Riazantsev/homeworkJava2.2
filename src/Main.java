public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int replenishment = 1200;
        int balanceAfterReplenisment = balance + replenishment;


        int percent = 1;
        int bonus = balanceAfterReplenisment / 100 * percent;
        if (balanceAfterReplenisment < 1000) {
            bonus = 0;
        }
        int finalBalance = bonus + balanceAfterReplenisment;
        System.out.println("Итоговый бонус: " + bonus + " RUB");
        System.out.println("Итоговый баланс: " + finalBalance + " RUB");

    }
}