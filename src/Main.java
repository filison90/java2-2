public class Main {
    public static void main(String[] args) {



                // Объявляете переменные для входных данных и
                // параметров программы: начального счёта,
                // суммы пополнения и тп

                // Условным оператором проверяете превысила ли
                // сумма пополнения порог и для этих двух разных
                // сценариев рассчитываете сумму бонуса и выводите
                // на экран.

        int popolnenie = 900;
        int bonus = 100;
        int ostatok = 50;

        boolean hohel = popolnenie >= 1000;

        if (hohel){
            System.out.println((popolnenie/bonus)+ostatok+popolnenie);
        }else {
            System.out.println(popolnenie+ostatok);
        }

    }
}
