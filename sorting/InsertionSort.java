//REF https://en.wikipedia.org/wiki/Insertion_sort
public class InsertionSort {
    
    public static void main(String[] args) {
        System.out.println("#### InsertionSort ####");
        String str = "science";
        char[] strArr = str.toCharArray();
        insertionSort(strArr);
        System.out.println("*****");
        
        strArr = str.toCharArray();
        insertionSortImproved(strArr);
    }
    
    static void insertionSort(char[] strArr) {
        System.out.println(strArr);
        int n = strArr.length;
        for(int i=1; i<n; i++) {
            for(int j=i; j>0; j--) {
                if(strArr[j] < strArr[j-1]) {
                    char tmp = strArr[j-1];
                    strArr[j-1] = strArr[j];
                    strArr[j] = tmp;
                }
            }
            System.out.println(strArr);
        }
        //System.out.println(strArr);
    }
    
    static void insertionSortImproved(char[] strArr) {
        System.out.println(strArr);
        int n = strArr.length;
        for(int i=1; i<n; i++) {
            char tmp = strArr[i];
            int j = i - 1;
            while(j >= 0 && strArr[j] > tmp) {
                strArr[j+1] = strArr[j];
                j = j - 1;
            }
            strArr[j+1] = tmp;
            System.out.println(strArr);
        }
        //System.out.println(strArr);
    }
}