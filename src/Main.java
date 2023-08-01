public class Main {
    public static void main(String[] args) {

       int balance = 100;
       int replenishment = 1500;
       int finalBalance = balance + replenishment;

       System.out.println(finalBalance);

       boolean sufficientReplenishmentAmount = true;
       int bonus = sufficientReplenishmentAmount ? 1 : 0;
       int finalBalance = balance / 100 * bonus;
        if (finalBalance > 1000) {

        }

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}