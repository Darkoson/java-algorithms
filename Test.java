import java.util.Arrays;
public class Test {
    public static void main(String[] args) {
        System.out.println(test("abcd", "dbcae"));
    }

    public static char test(String s, String t){

        char s1[] = s.toCharArray();
        char t1[] = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);

        for (int i = 0; i < s1.length; i++) {
            if(s1[i] !=t1[i]){
                return t1[i];
            }
            
        }
        return t1[t1.length-1];

    }
}
