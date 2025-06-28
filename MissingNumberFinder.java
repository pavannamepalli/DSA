import java.util.Arrays;

public class MissingNumberFinder {
    

    public static void main(String[] args) {
        int[] arr ={1,2,4,5};

      int k = arr.length;

      for (int i = 1; i <= k; i++) {

        int flag = 0;

        for (int j = 0; j < arr.length; j++) {
        
            if(arr[j] == i){
                flag =1;
            break;            }
            
        }

        if (flag == 0) {
            System.out.println("missing number is "+i);
        }
        
      }
    }
}
