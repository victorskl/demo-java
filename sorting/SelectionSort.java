//REF https://en.wikipedia.org/wiki/Selection_sort
public class SelectionSort {
    
    public static void main(String[] args) {
        System.out.println("#### SelectionSort ####");
        String str = "science";
        char[] strArr = str.toCharArray();
        
        selectionSort(strArr);
    }
    
    static void selectionSort(char[] strArr) {
        System.out.println(strArr);
        int n = strArr.length;
        
        for (int j=0; j<n-1; j++) {
            int iMin = j;
            for (int i=j+1; i<n; i++) {
                if (strArr[i] < strArr[iMin]) {
                    iMin = i;
                }
                
                if (iMin != j) {
                    char tmp = strArr[j];
                    strArr[j] = strArr[iMin];
                    strArr[iMin] = tmp;
                    iMin = j;
                }
            }
            System.out.println(strArr);
        }
        //System.out.println(strArr);
    }
}