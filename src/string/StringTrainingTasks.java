package string;

import java.util.Arrays;

public class StringTrainingTasks {
    public static void main(String[] args) {
        System.out.println(isPalindrome("aa"));
    }

    //Ќапишите программу, котора€ принимает от пользовател€ строку и выводит ее длину.
    public static int strLength(String str) {
        return str.length();
    }

    //Ќапишите программу, котора€ принимает от пользовател€ две строки и провер€ет, равны ли они друг другу.
    public static boolean strEquals(String str1, String str2) {
        return str1.equals(str2);
    }

    //Ќапишите программу, котора€ принимает от пользовател€ строку и выводит ее в обратном пор€дке.
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

    //Ќапишите программу, котора€ принимает от пользовател€ строку и выводит ее первый и последний символы.
    public static void strFirstAndLastSymbols(String str1) {
        char first = str1.charAt(0);
        char last = str1.charAt(str1.length() - 1);
        System.out.println(first + " " + last);
    }

    //Ќапишите программу, котора€ принимает от пользовател€ строку и замен€ет в ней все пробелы на тире.
    public static String strReplaceSpaces(String str1) {
        return str1.replace(' ', '-');
    }

    //Ќапишите программу, котора€ принимает от пользовател€ строку и делит ее на слова.
    public static String[] strSplit(String str1) {
        return str1.split(" ");
    }

    //Ќапишите программу, котора€ принимает от пользовател€ строку и провер€ет, содержит ли она только цифры.
    public static boolean strOnlyNumbers(String str1) {
        return str1.matches("\\d+");
    }

    /*Ќапишите программу, котора€ принимает от пользовател€ строку и провер€ет,
     €вл€етс€ ли она палиндромом (то есть читаетс€ одинаково слева направо и справа налево).
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
