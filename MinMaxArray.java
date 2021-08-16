public class MinMaxArray {
    public static void main(String[] args) {
        int A[]  = new int[] {1, 0, 577, 345, 234, 21, 56789} ;
        minMax(A) ;

    }

    public static void minMax(int[] arr){
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i]  > max){
                max = arr[i] ;
            }

        }

        System.out.println(" Min =" + min + " and Max = "+ max);
    }
}
