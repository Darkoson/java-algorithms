public class Turing2 {
    public static void main(String[] args) {
        String[] arr = new String[]{ "5","D", "C"} ;

        System.out.println(compute(arr));
    }

    public static int compute(String[] arr){

        int[] scores = new int[arr.length];
        int counter = 0;
        int result = 0;

        for (int i = 0; i < arr.length; i++) {



            if(isNumeric(arr[i])) {
                counter++;
                scores[counter-1]= Integer.parseInt(arr[i]) ;
            }

            if(arr[i] == "+") {
                counter++;
                int newVal = 0;

                for (int j = 0; j < counter; j++) {
                    newVal += scores[j];
                } ;
                scores[counter-1]=newVal ;
            }

            if(arr[i] == "D") {
                counter++;
                scores[counter-1] = scores[counter-2]*2 ;
            }

            if(arr[i] == "C"){
                counter -- ;
                scores[counter]= 0;
            }


        }

        
        for (int i = 0; i < counter; i++) {
            result += scores[i] ;
            System.out.println(scores[i]);
        }

        return result ;
    }

    public static boolean isNumeric(String s){
        return s.matches("\\d+");
    }
}
