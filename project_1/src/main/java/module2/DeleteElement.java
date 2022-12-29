package module2;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class DeleteElement {
    /*
    Xóa phần tử bất kì trong mảng
     */
    public static void main(String[] args) {
        int n, a, c;
        Scanner scanner = new Scanner(System.in);
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
        System.out.println("Nhập vào phần tử số nguyên cần xóa");
        a = Integer.parseInt(scanner.nextLine());
        for (int i = c = 0; i < n; i++) {
            if (array[i] != a) {
                array[c] = array[i];
                c++;
            }
        }
        n = c;
        System.out.println("Phần tử mảng còn lại sau khi xóa");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
