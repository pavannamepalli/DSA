import java.util.Arrays;

public class SecondMinMaxFinder {

    public static void main(String[] args) {
        
        int[] arr = {1,2,4,7,6,5};

        Arrays.sort(arr);


        System.err.println("the second smallest array is "+arr[1] + " the second largest element is "+arr[arr.length-2]);
    }
    
}
