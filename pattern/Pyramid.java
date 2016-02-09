public class Pyramid {
    
    public static void main(String[] args) {
        int noOfRows = 5;
        if (args.length > 0) {
            noOfRows = Integer.parseInt(args[0]);
        }
        
        pattern1(noOfRows);
        pattern2(noOfRows);
        pattern3(noOfRows);
        pattern4(noOfRows);
        pattern5(noOfRows);
        pattern6(noOfRows);
    }
    
    static void pattern1(int noOfRows) {
        for (int i=0; i<noOfRows; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    static void pattern2(int noOfRows) {
        for (int i=0; i<noOfRows; i++) {
            for (int j=noOfRows; j>i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    static void pattern3(int noOfRows) {
        for (int i=0; i<noOfRows; i++) {
            
            for (int j=noOfRows-1; j>i; j--) {
                System.out.print(" ");
            }
            
            for (int k=0; k<=i; k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    
    static void pattern4(int noOfRows) {
        for (int i=0; i<noOfRows; i++) {
            
            for (int j=0; j<i; j++) {
                System.out.print(" ");
            }
            
            for (int k=noOfRows; k>i; k--) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    
    static void pattern5(int noOfRows) {
        for (int i=0; i<noOfRows; i++) {
            
            for (int j=noOfRows-i; j>1; j--) {
                System.out.print(" ");
            }
            
            for (int k=0; k<=i; k++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
    
    static void pattern6(int noOfRows) {
        int growth = 0;
        for (int i=0; i<noOfRows; i++) {
            
            for (int j=noOfRows-i; j>1; j--) {
                System.out.print(" ");
            }
            
            for (int k=0; k<=growth; k++) {
                System.out.print("*");
            }
            
            growth += 2;
            System.out.println();
        }
    }
}