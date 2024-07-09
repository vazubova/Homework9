public class Main {
    public static void main(String[] args) {

        int[] payments = {70, 498, 24, 11, 39};
        int sum = 0;
        for (int i = 0; i < payments.length; i++) {
            sum += payments[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum);

        int maxPayment = -1;
        int minPayment = 1000;
        for (int j = 0; j < payments.length; j++) {
            if (payments[j] > maxPayment) {
                maxPayment = payments[j];
            }
        }
        System.out.println("Максимальная сумма трат за неделю сотсавила " + maxPayment + " рублей");

        for (final int current : payments) {
            if (current < minPayment) {
                minPayment = current;
            }

        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPayment + " рублей");

        double averageSpending = sum / payments.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSpending + " рублей");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
            if (i > 0) {
                System.out.print(" ");

            }


        }
    }
}