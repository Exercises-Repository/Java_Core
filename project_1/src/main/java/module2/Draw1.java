package module2;

public class Draw1 {
    /*
    Vẽ hình tam giác
     */
    public static void main(String[] args) {
        for (int i = 5; i > -1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("  ");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("  ");
        }
    }
}

