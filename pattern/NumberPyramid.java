public class NumberPyramid {
    
    public static void main(String[] args) {
        int n = 10;
        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        }
        
        int i, j, k;
        
        for (i=0; i<n; i++) {
            
            for (j=n-1; j>i; j--) {
                System.out.print(" ");
            }
            
            for (j=0, k=i; j<=i; j++, k++) {
                //System.out.print("*");
                System.out.print(k%10);
            }
            
            //System.out.print(" "+k);
            
            for (j=0, k-=2; j<=i-1; j++, k--) {
                System.out.print(k%10);
            }
            
            System.out.println();
        }
    }
}