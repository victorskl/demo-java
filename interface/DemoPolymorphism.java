//DemoPolymorphism.java
public class DemoPolymorphism
{
    public static void main(String[] args)
    {
        GeometricInterface vars;
        vars = new Square(1,2,3);
        System.out.println("Area of square = " +vars.getArea());
        vars = new Circle(1,2,3);
        System.out.println("Area of circle = " +vars.getArea());
        vars = new CampusArea(3,3);
        System.out.println("Area of campus = " +vars.getArea());

    }
}