package module2;

import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 7, 2, 56, 9};
        Scanner scanner = new Scanner(System.in);
        int indexInsert;
        System.out.println("Nhập vào index cần chèn");
        indexInsert = scanner.nextInt();
        System.out.println("Nhập vào số cần chèn");
        int numberInsert = scanner.nextInt();
        if (indexInsert == array.length - 1) {
            System.out.println("Không thể chèn phần tử vào được");
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (indexInsert == array[i]) {
                array[i] = numberInsert;
            }
        }
        System.out.println(array);
    }
}
