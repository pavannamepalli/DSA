public class CheckIfArrayIsSorted {

    public static void main(String[] args) {
        
          int[] arr = {5,4,6,7,8};

          boolean value = checkArraySorted(arr);

          System.err.println(value);
          

    }

     static  boolean checkArraySorted(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1]<arr[i]){
                return false;

            }
            
        }


        return true;
        
    }
    
}
