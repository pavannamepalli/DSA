public class LargestElementInArray {
    
    public static void main(String[] args) {
        
        int[] arr = {3, 3, 0, 99, -40};

        int largeEle = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largeEle){
                largeEle =arr[i];
            }
        }

        System.err.println("largest Elem "+largeEle);


    }
}
