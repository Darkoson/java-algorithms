public class KthSmallestElement {

    public static void main(String[] args) {
        int[] arr = new int[]{25, 45,5,2};
        
        System.out.println(kthSmallest(arr, 2));
    }
    
    public static int kthSmallest(int[] arr, int k) 
    { 
         for(int i=0; i<arr.length-1; i++){
             for(int j=i+1; j<arr.length; j++){
                 
                 if(arr[i]>arr[j]){
                     int x = arr[i] ;
                     arr[i] = arr[j] ;
                     arr[j]  = x;
                 }
             }
                 
        }
        
        return arr[k-1];
    } 
}
