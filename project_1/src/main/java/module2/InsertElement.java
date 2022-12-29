package module2;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertElement {
    /*
    Chèn phần tử bất kì vào mảng
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhập vào số lương phần tử trong mảng");
            n = Integer.parseInt(scanner.nextLine());
        } while (n <= 0);
        int array[] = new int[n];
        System.out.println("Nhập vào các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào phần tử:" + (i + 1));
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập vị trí cần chèn");
        int index = scanner.nextInt();
        System.out.println("Nhập vào số cần chèn");
        int numberInsert = scanner.nextInt();
        if (index == array.length - 1) {
            System.out.println("Không thể chèn phần tử vào được");
        }
        for (int i = 0; i <= array.length - 1; i++) {
            if (index == array[i]) {
                array[i] = numberInsert;
            }
        }
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.println(array[i]);
        }
    }
}
