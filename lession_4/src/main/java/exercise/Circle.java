package exercise;

public class Circle extends Shape{
    /*
    Triển khai lớp Circle
     */
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getRadius() {
        System.out.println("Phương thức getRadius");
    }

    public void getArea() {
        System.out.println("Phương thức getArea");
    }
}
