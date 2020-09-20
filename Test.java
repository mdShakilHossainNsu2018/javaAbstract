
public class Test {

    public static void main(String[] args) {
//       Shape s1 = new Circle() ;
        Circle s1 = new Circle("red" ,true, 5.5);

        System.out.println("Color: " + s1.getColor());
        System.out.println("Filled: " + s1.isFilled());
        System.out.println("Radius: " + s1.getRadius());
        System.out.println("Area: " + s1.getArea());
        System.out.println("Perimeter: " + s1.getPerimeter());
        System.out.println();

//        Circle c1 = (Circle) s1;
//
//        System.out.println("Color: " + c1.getColor());
//        System.out.println("Filled: " + c1.isFilled());
//        System.out.println("Radius: " + c1.getRadius());
//        System.out.println("Area: " + c1.getArea());
//        System.out.println("Perimeter: " + c1.getPerimeter());
//        System.out.println();

    }

}
