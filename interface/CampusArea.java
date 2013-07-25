//CampusArea.java
public class CampusArea implements GeometricInterface
{
    private double width;
    private double length;

    public CampusArea(double width, double length)
    {
        this.width = width;
        this.length = length;
    }

    public double getArea()
    {
        return ( width * length );
    }
}