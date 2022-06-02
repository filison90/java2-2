public class Main {
    public static void main(String[] args) {


        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        int replenishment = 900;
        int bonus = 100;
        int remains = 50;

        boolean cost = replenishment > 1000;

        if (cost) {
            System.out.println((replenishment / bonus) + remains + replenishment);
        } else {
            System.out.println(replenishment + remains);
        }

    }
}
