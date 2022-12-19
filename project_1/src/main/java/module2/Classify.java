package module2;

import java.util.Scanner;

public class Classify {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số điểm học viên");
        int point = scanner.nextInt();
        if (point >= 75) {
            System.out.println("Học viên đạt loại A");
        } else if (point >= 60 && point < 75) {
            System.out.println("Học viên đạt loại B");
        } else if (point >= 45 && point < 60) {
            System.out.println("Học viên đạt loại C");
        } else if (point >= 35 && point < 45) {
            System.out.println("Học viên đạt loại D");
        } else {
            System.out.println("Học viên đạt loại E");
        }
    }
}