public class Diamond {
    
    public static void main(String[] args) {
        int noOfRows = 5; //number of rows upto symmetrical baseline (inclusive)
        if (args.length > 0) {
            noOfRows = Integer.parseInt(args[0]);
        }
        
        pattern1(noOfRows);
        pattern2(noOfRows);
    }
    
    static void pattern1(int noOfRows) {
        
        for (int i=0; i<noOfRows; i++) {
            
            for (int j=noOfRows-1; j>i; j--) {
                System.out.print(" ");
            }
            
            for (int k=0; k<=i*2; k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        for (int a=noOfRows-1; a>0; a--) {
            
            for (int b=0; b<noOfRows-a; b++) {
                System.out.print(" ");
            }
            
            for (int c=0; c<a*2-1; c++) { // -1 is for zero index
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    
    static void pattern2(int noOfRows) {
        
        for (int i=0; i<noOfRows; i++) {
            
            for (int j=noOfRows-1; j>i; j--) {
                System.out.print(" ");
            }
            
            for (int k=0; k<=i; k++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
        
        for (int a=noOfRows-1; a>0; a--) {
            
            for (int b=0; b<noOfRows-a; b++) {
                System.out.print(" ");
            }
            
            for (int c=0; c<a; c++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}