public class MaxConsecutiveOnesCounter {
    
    public static void main(String[] args) {
        
        int[] arr ={1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,0,1,1,1,1,1,1,1,};
        int c = 0,pc = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] ==1){
                c++;

            }else{
                pc=Math.max(c, pc);
                c=0;
            }
            
        }

        if(pc>c){
            System.out.println(pc);
        }else{
            System.out.println(c);
        }
    }
}
