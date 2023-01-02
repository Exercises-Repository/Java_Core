package exercise;

import java.util.Scanner;

import static java.lang.Math.pow;

public class QuadraticEquation {
        private double a;
        private double b;
        private double c;

        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getA() {
            return a;
        }

        public double getB() {
            return b;
        }

        public double getC() {
            return c;
        }

        public void setA(double a) {
            this.a = a;
        }

        public void setB(double b) {
            this.b = b;
        }

        public void setC(double c) {
            this.c = c;
        }

        public String displayQuadratic() {
            return " QuadraticEquation{" +
                    a + "x^2 + "
                    + b + "y + "
                    + c + " = 0" +
                    "}";
        }

        public double getDiscriminant() {
            return Math.pow(this.b, 2) - 4 * this.a * this.c;
        }

        public double getRoot1() {
            return (-this.b + Math.pow(getDiscriminant(), 0.5)) / (2 * this.a);
        }

        public double getRoot2() {
            return (-this.b - Math.pow(getDiscriminant(), 0.5)) / (2 * this.a);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào a");
            double a = scanner.nextDouble();
            System.out.println("Nhập vào b");
            double b = scanner.nextDouble();
            System.out.println("Nhập vào c");
            double c = scanner.nextDouble();
            QuadraticEquation equation;
            equation = new QuadraticEquation(a, b, c);
            System.out.println("Thông tin phương trình" + equation.displayQuadratic());
            if (equation.getDiscriminant() < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (equation.getDiscriminant() == 0) {
                System.out.println("Phương trình có 1 nghiệm duy nhất: " + (-b / 2 * a));
            } else {
                System.out.println("Phương trình có 2 nghiêm " + equation.getRoot1() + " và " + equation.getRoot2());
            }
        }
}