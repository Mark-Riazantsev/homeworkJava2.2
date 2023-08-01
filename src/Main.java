public class Main {
    public static void main(String[] args) {

       int balance = 100;
       int replenishment = 1331;
       int finalBalance = balance + replenishment;

       System.out.println(finalBalance);

       boolean sufficientReplenishmentAmount = true;
       int percent = sufficientReplenishmentAmount ? 1 : 0;
       int bonus = finalBalance / 100 * percent;
        if (finalBalance > 1000) {

        }

        System.out.println(bonus);
    }
}