public class SortedArrayChecker {

    public static void main(String[] args) {
        
                int[] arr = {1,2,4,6,6,7};

                boolean value = arraySorted(arr);

                System.out.println(value);

                
    }

    private static  boolean arraySorted(int[] arr) {

        boolean value = false ;
      
        for (int i = 0; i < arr.length-1; i++) {
                    if(arr[i] < arr[i+1]){

                        value = true;
                       
                    } else{
                        value = false;
                    }
                    
                }
                return value;
                
    }
    
}
