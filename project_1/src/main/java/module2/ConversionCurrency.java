package module2;

import java.util.Scanner;

public class ConversionCurrency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MONEY = 23000;
        System.out.println("Nhập số tiền Đô la Mỹ:");
        int dola = scanner.nextInt();
        int vnd = dola * MONEY;
        System.out.println("Số tiền Việt Nam quy đổi ra là:" + vnd);
    }
}
