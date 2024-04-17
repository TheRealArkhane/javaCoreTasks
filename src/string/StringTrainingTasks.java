package string;

import java.util.Arrays;

public class StringTrainingTasks {
    public static void main(String[] args) {
        System.out.println(isPalindrome("aa"));
    }

    //�������� ���������, ������� ��������� �� ������������ ������ � ������� �� �����.
    public static int strLength(String str) {
        return str.length();
    }

    //�������� ���������, ������� ��������� �� ������������ ��� ������ � ���������, ����� �� ��� ���� �����.
    public static boolean strEquals(String str1, String str2) {
        return str1.equals(str2);
    }

    //�������� ���������, ������� ��������� �� ������������ ������ � ������� �� � �������� �������.
    public static String strReverse(String str1) {
        char[] chars = str1.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    //�������� ���������, ������� ��������� �� ������������ ������ � ������� �� ������ � ��������� �������.
    public static void strFirstAndLastSymbols(String str1) {
        char first = str1.charAt(0);
        char last = str1.charAt(str1.length() - 1);
        System.out.println(first + " " + last);
    }

    //�������� ���������, ������� ��������� �� ������������ ������ � �������� � ��� ��� ������� �� ����.
    public static String strReplaceSpaces(String str1) {
        return str1.replace(' ', '-');
    }

    //�������� ���������, ������� ��������� �� ������������ ������ � ����� �� �� �����.
    public static String[] strSplit(String str1) {
        return str1.split(" ");
    }

    //�������� ���������, ������� ��������� �� ������������ ������ � ���������, �������� �� ��� ������ �����.
    public static boolean strOnlyNumbers(String str1) {
        return str1.matches("\\d+");
    }

    /*�������� ���������, ������� ��������� �� ������������ ������ � ���������,
     �������� �� ��� ����������� (�� ���� �������� ��������� ����� ������� � ������ ������).
     */
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
