public class SortArray {
    public static void main(String[] args) {
        int A[]  = new int[] {1, 0, 577, 345, 234, 21, 56789} ;
        for (int i = 0; i < A.length; i++) {
            System.out.print( sort(A)[i] + " , ");
        }
        
    }

    private static int[] sort(int[] arr) {
        int tmp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    tmp = arr[i] ;
                    arr[i] = arr[j]  ;
                    arr[j] = tmp ;
                }
                
            }
            
        }

        return arr ;
        
    }
}
