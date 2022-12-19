package module2;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng trong dãy số:");
        int a = 0;
        int n = scanner.nextInt();

        while (a <= n) {
            System.out.println("Nhập giá trị" + a);
            a = scanner.nextInt();
            a += 1;
        }
    }
}
