public class Turing1 {
    
    public static void main(String[] args) {

        int[] arr = new int[]{ 1,2,3, 5, 8,6,4} ;

        System.out.println(find(arr) );
        
        
    }

    public static int find(int[] arr){

        int value = 0;

        for (int i = 0; i < arr.length; i++) {
            Boolean exist = false ;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]+1 == arr[j]){
                    exist = true;
                    break ;
                }
            }

            if(exist){
                value++;
            }
        }

        return value ;
    }
}
