//Shape.java
public abstract class Shape
{
    protected int posX;
    protected int posY;

    public Shape (int x, int y)
    {
        posX = x;
        posY = y;
    }

    public abstract double getArea();
}