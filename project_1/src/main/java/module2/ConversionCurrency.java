package module2;

import java.util.Scanner;

public class ConversionCurrency {
    /*
   Quy đổi tiền tệ
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int RATE = 23000;
        System.out.println("Nhập số tiền Đô la Mỹ:");
        int dola = scanner.nextInt();
        int vnd = dola * RATE;
        System.out.println("Số tiền Việt Nam quy đổi ra là:" + vnd);
    }
}
