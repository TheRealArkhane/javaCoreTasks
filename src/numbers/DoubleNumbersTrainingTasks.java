package numbers;

public class DoubleNumbersTrainingTasks {
    public static void main(String[] args) {
        System.out.println(format(3.64234365121));
    }

    /*
    �������� ���������, ������� ��������� �� ������������ �����
    � ��������� ������� � ������� ��� ��������, ����������� �� ������ �����.
     */
    public static int round(double number) {
        return (int) Math.round(number);
    }

    /*
    �������� ���������, ������� ��������� �� ������������ �����
    � ��������� ������� � ������� ��� �������� � ������� 2, 3, 4, 5 � 6.
     */
    public static void power(double number, int exponent) {
        for (int i = 0; i <= exponent; i++) {
            System.out.println(Math.pow(number, i));
        }
    }

    /*
    �������� ���������, ������� ��������� �� ������������ �����
    � ��������� ������� � ������� ��� ��������, ����������� �� ���� ������ ����� �������.
     */
    public static double format(double number) {
        return Math.round(number * 100.0) / 100.0;
    }
}
