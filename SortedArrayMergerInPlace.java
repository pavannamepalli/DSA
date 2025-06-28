import java.util.Arrays;

public class SortedArrayMergerInPlace {
    
    public static void main(String[] args) {
        
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};



        int index = 0;


        for (int i = 3; i < nums1.length; i++) {

            

            nums1[i]=nums2[index++];
            //index++;
            
        }

        Arrays.sort(nums1);
        for (int i : nums1) {
             System.out.print(i);
        }

       

    }
}
