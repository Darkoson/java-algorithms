public class KeyInArraySegment{

    public static void main(String[] args) {
        int arr[] = new int[] {3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3};

            System.out.println(keyInArray(3,3, arr));
    }

    public static boolean keyInArray(int x, int k, int[] arr){
        boolean result =  false;
        int n = arr.length ;
        for (int i = 0; i < n ; i+=k) {
            boolean found = false ;

            for(int j=0; j<k && j+i<n; j++){
                if(arr[i+j] == x){
                    found = true;
                    break;
                }
            }
            
            result  = found;
            if(!found) break ;
        }

        return result ;
    }
}