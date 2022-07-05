public class Main {
    public static void main(String[] args) {

        int initialAccount = 100;
        int depositAmount = 1100;

        int finalAccount = initialAccount + depositAmount;

        int bonusRubles;
        if (depositAmount >= 1000) {
            bonusRubles = finalAccount + depositAmount * 1 / 100;
        } else {
            bonusRubles = finalAccount;
        }
System.out.println("Итоговая сумма на счету : " + bonusRubles );

    }

    // Объявляете переменные для входных данных и
    // параметров программы: начального счёта,
    // суммы пополнения и тп

    // Условным оператором проверяете превысила ли
    // сумма пополнения порог и для этих двух разных
    // сценариев рассчитываете сумму бонуса и выводите
    // на экран.
}
