public class Turing4 {
    
    public static void main(String[] args) {
        int[] arr = new int[]{ 0,4,5,8,-14,-100} ;

    System.out.println(find(arr) );
    }


    public static int find(int[] arr){
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%4 == 0){
                result += arr[i] ;
            }
        }

        return result;
    }
}
