//Square.java
public class Square extends Shape
{
    private int side;

    public Square (int x, int y, int s)
    {
        super(x,y);
        side = s;
    }

    public double getArea()
    {
        return ( side * side );
    }
}