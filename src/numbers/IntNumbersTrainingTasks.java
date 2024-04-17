package numbers;

public class IntNumbersTrainingTasks {
    public static void main(String[] args) {
        primeFactorsOfNumber(200);
    }

    /*
    �������� ���������, ������� ��������� �� ������������ ��� ����� �����
    � ������� �� �����, �������, ������������ � �������.
    */
    public static void sumSubstractionProductQuotient(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        int substraction = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        double quotent = (double) firstNumber / secondNumber;
        System.out.println("����� = " + sum + "\n" +
                            "������� = " + substraction + "\n" +
                            "������������ = " + product + "\n" +
                            "������� = " + quotent);
    }

    /*
    �������� ���������, ������� ��������� �� ������������ ����� ����� � ���������,
    �������� �� ��� ������� (�� ���� ������� ��� ������� ������ �� 1 � �� ����).
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
    �������� ���������, ������� ������� ��� ������� ����� � ��������� �� 1 �� n.
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
    �������� ���������, ������� ��������� �� ������������ ����� ����� � ������� ��� ���������� �� ������� ���������.
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
