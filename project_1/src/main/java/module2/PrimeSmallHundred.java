package module2;

import java.util.Scanner;

public class PrimeSmallHundred {
    /*
    Tìm các số nguyên tố nhỏ hơn 100
     */
    public static void main(String[] args) {
        int n = 100;
        System.out.println("Tất cả các số nguyên tố nhỏ hơn 100:");
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i+=2) {
            if (isNumberPrime(i)) {
                System.out.print(" " + i);
            }
        }
    }
    public static boolean isNumberPrime(int number) {
        if (number <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.floor(Math.sqrt(number)); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
