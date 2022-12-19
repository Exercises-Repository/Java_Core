package module2;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập kích thước mảng:");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Kích thước mảng phải nhỏ hơn 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhập phần tử" + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        int temp;
        for (int j = 0; j < array.length / 2; j++) {
            temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;

        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }


}
