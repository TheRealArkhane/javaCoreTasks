package numbers;

public class IntNumbersTrainingTasks {
    public static void main(String[] args) {
        primeFactorsOfNumber(200);
    }

    /*
    Напишите программу, которая принимает от пользователя два целых числа
    и выводит их сумму, разницу, произведение и частное.
    */
    public static void sumSubstractionProductQuotient(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        int substraction = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        double quotent = (double) firstNumber / secondNumber;
        System.out.println("Сумма = " + sum + "\n" +
                            "Разница = " + substraction + "\n" +
                            "Произведение = " + product + "\n" +
                            "Частное = " + quotent);
    }

    /*
    Напишите программу, которая принимает от пользователя целое число и проверяет,
    является ли оно простым (то есть делится без остатка только на 1 и на себя).
     */
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /*
    Напишите программу, которая выводит все простые числа в диапазоне от 1 до n.
     */
    public static void primeNumbersFrom1toN(int n) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                j++;
            }
        }
    }

    /*
    Напишите программу, которая принимает от пользователя целое число и выводит его разложение на простые множители.
     */
    public static void primeFactorsOfNumber(int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
    }
}
