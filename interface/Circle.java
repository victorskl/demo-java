//Circle.java
public class Circle extends Shape implements GeometricInterface
{
    private int radius;

    public Circle (int x, int y, int r)
    {
        super(x,y);
        radius = r;
    }

    public double getArea()
    {
        return (Math.PI * radius * radius);
    }
}