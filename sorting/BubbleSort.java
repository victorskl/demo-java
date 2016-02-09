//REF: https://en.wikipedia.org/wiki/Bubble_sort
public class BubbleSort {

    public static void main(String[] args) {
        System.out.println("#### BubbleSort ####");
        String str = "science";
        char[] strArr = str.toCharArray();
        
        bubbleSort(strArr);
        
        System.out.println("*****");
        strArr = str.toCharArray(); //reset
        
        bubbleSortOptimized(strArr);
        
        System.out.println("*****");
        strArr = str.toCharArray();
        
        bubbleSortOptimizedWithLastBestSortedPosition(strArr);
    }
    
    static void bubbleSort(char[] strArr) {
        System.out.println(strArr);
        int n = strArr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i=1; i<n; i++) {
                if(strArr[i] < strArr[i-1]) {
                    char tmp = strArr[i-1];
                    strArr[i-1] = strArr[i];
                    strArr[i] = tmp;
                    swapped = true;
                }
            }
            System.out.println(strArr);
        } while (swapped);
        //System.out.println(strArr);
    }
    
    //optimize inner loop
    static void bubbleSortOptimized(char[] strArr) {
        System.out.println(strArr);
        int n = strArr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i=1; i<n; i++) {
                if(strArr[i] < strArr[i-1]) {
                    char tmp = strArr[i-1];
                    strArr[i-1] = strArr[i];
                    strArr[i] = tmp;
                    swapped = true;
                }
            }
            //after the first pass, we found the largest element and put it into final place.
            //so we can skip this larget element in next pass.
            n = n - 1;
            System.out.println(strArr);
        } while (swapped);
        //System.out.println(strArr);
    }
    
    //instead of boolean swapped state, we can use last sorted position value
    static void bubbleSortOptimizedWithLastBestSortedPosition(char[] strArr) {
        System.out.println(strArr);
        int n = strArr.length;
        do {
            int newn = 0;
            for (int i=1; i<n; i++) {
                if(strArr[i] < strArr[i-1]) {
                    char tmp = strArr[i-1];
                    strArr[i-1] = strArr[i];
                    strArr[i] = tmp;
                    newn = i;
                }
            }
            //after every pass, all elements after the last swap are sorted,
            //and do not need to be checked again.
            n = newn;
            System.out.println(strArr);
        } while (n != 0);
        //System.out.println(strArr);
    }
}