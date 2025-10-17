package Task17102025;

import java.util.*;

class NumberAnalyzer {

    // Check if number is Armstrong
    public static boolean isArmstrong(int n) {
        int temp = n, sum = 0, digits = 0;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        temp = n;
        while (temp > 0) {
            int r = temp % 10;
            sum += Math.pow(r, digits);
            temp /= 10;
        }
        return sum == n;
    }

    // Check if number is Prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Check if number is Palindrome
    public static boolean isPalindrome(int n) {
        int rev = 0, temp = n;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev == n;
    }

    // Check if number is Strong
    public static boolean isStrong(int n) {
        int temp = n, sum = 0;
        while (temp > 0) {
            int r = temp % 10;
            sum += factorial(r);
            temp /= 10;
        }
        return sum == n;
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }

    // Check if number is Disarium
    public static boolean isDisarium(int n) {
        int len = String.valueOf(n).length();
        int temp = n, sum = 0;
        while (temp > 0) {
            int r = temp % 10;
            sum += Math.pow(r, len--);
            temp /= 10;
        }
        return sum == n;
    }

    public static void analyzeNumber(int n) {
        System.out.println("\nAnalyzing Number: " + n);
        System.out.println("---------------------------");
        System.out.println("Armstrong Number : " + isArmstrong(n));
        System.out.println("Prime Number     : " + isPrime(n));
        System.out.println("Palindrome       : " + isPalindrome(n));
        System.out.println("Strong Number    : " + isStrong(n));
        System.out.println("Disarium Number  : " + isDisarium(n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to analyze: ");
        int num = sc.nextInt();

        analyzeNumber(num);
        sc.close();
    }
}
