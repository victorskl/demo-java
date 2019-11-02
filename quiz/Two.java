import java.lang.*;
public class Two
{
    public static void main(String[] args) {
        System.out.println();
        System.out.println(Math.round(10.55));
        System.out.println(Math.nextUp(10.22));
        System.out.println(Math.nextAfter(10.22, 0.01));
        System.out.println(Math.round(10.99));
        
        
        int a =0, b=0;
        b = a + 1;
        System.out.println("a = " + a + "b = " + b);
        b = a++;
        System.out.println("a = " + a + "b = " + b);
        b = ++a;
                System.out.println("a = " + a + "b = " + b);        
    }
}
