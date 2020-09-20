
//public abstract class Rectangle extends Shape {
public class Rectangle extends Shape {

    private double width;
    private double length;

//    public Rectangle() {
//        super();
//    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

//    public Rectangle(double width, double length, String color, boolean filled) {
//        this.width = width;
//        this.length = length;
//        setColor(color);
//        setFilled(filled);
//    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter1() {
        return 2 * (width + length);
    }

//    public abstract double getperimeter();

    public String tostring() {
        return "Rectangle[color:" + getColor() + ",filled:" + isFilled() + ",Perimeter:" + getPerimeter1() + "]";
    }
}
