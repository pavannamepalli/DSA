import java.util.Arrays;

public class SortedSquaresGenerator {
        public static void main(String[] args) {
            
            int[] arr = {-4,-1,0,3,10};

            for (int i = 0; i < arr.length; i++) {

                arr[i] = arr[i] * arr[i];
               
            }
            
            Arrays.sort(arr);

            for (int i : arr) {
                System.out.println(i);
            }
        }
}
