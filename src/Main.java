public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int replenishment = 1222;
        int finalBalance = balance + replenishment;

        System.out.println("Итоговый баланс: " + finalBalance);

        boolean sufficientReplenishmentAmount = true;
        int percent = sufficientReplenishmentAmount ? 1 : 0;
        int bonus = finalBalance / 100 * percent;
        if (finalBalance < 1000) {
            bonus = 0;
        }

        System.out.println("Итоговый бонус: " + bonus);
    }
}