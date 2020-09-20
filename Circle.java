
//public abstract class Circle extends Shape {
class Circle extends Shape {

    private double radius;

//    public Circle() {
//        super();
//    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

//    public Circle(double radius, String color, boolean filled) {
//        super(color, filled);
//        this.radius = radius;
//    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

//    public abstract double getperimeter();

    public String tostring() {
        return "Circlee[color:" + getColor() + ",filled:" + isFilled() + ",radius:" + radius + ",Perimeter:" + getPerimeter() + "]";
    }
}
