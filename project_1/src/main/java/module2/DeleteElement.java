package module2;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String @NotNull [] args) {
        int[] array = {11, 15, 5, 6, 44, 77, 8, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử cần xóa");
        int elementDlt = scanner.nextInt();
        for (int i = 0; i < args.length - 1; i++) {
            if (elementDlt == array[i]) {
                array[i] = 0;
                array[i] = array[i + 1];
            }
        }
    }

}
