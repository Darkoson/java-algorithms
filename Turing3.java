public class Turing3 {
    
    public static void main(String[] args) {
        int[] arr = new int[]{ 0,1,1,1,1,1,0} ;

    System.out.println(find(arr) );
    }

    public static int find(int[] arr){

        int start0, start1;
        int val0 =0;
        int val1 =0;

        for (int i = 0; i < arr.length; i++) {
            start0 = (i%2 == 0)? 0 : 1 ;
            start1 = (i%2 == 1)? 1 : 0 ;

            if(arr[i] != start0) val0++;
            if(arr[i] != start1) val1++;
            
        }
        return (val0<val1)? val0:val1 ;
    }
    
}
