import java.util.*;
public class FourtyNine
{
    public static void main(String[] args) {
        
        String sA = "A";
        String sB = "B";
        String sNull = null;
        StringBuilder sb = new StringBuilder("C");
        Formatter fmt = new Formatter(sb);
        
        fmt.format("%s%s",sA,sB);
        System.out.println("Line 1: " + fmt);
        
        fmt.format("%-2s",sB);
        System.out.println("Line 2: " + fmt);

        fmt.format("%b",sNull);
        System.out.println("Line 3: " + fmt);
    }
}
