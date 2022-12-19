package module2;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int math;
        int physics;
        int chemistry;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập điểm Toán");
        math = scanner.nextInt();
        System.out.println("Nhập điểm Lý");
        physics = scanner.nextInt();
        System.out.println("Nhập điểm Hoá");
        chemistry = scanner.nextInt();
        int average = math + physics + chemistry / 3;
        System.out.println("Điểm trung bình 3 môn là: " + average);
    }
}
