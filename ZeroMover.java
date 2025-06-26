public class ZeroMover {

    public static void main(String[] args) {
        
        int[]  a = { 1,2,0,1,0,4,0};

        for (int i = 0; i < a.length-1; i++) {
            {
                for (int j = i+1; j < a.length; j++) {
                    if(a[i] != 0){
                        i++;
                              
                    }else if( a[i] == 0 && a[j] != 0){
                        int k = a[j];
                        a[j] = a[i];
                        a[i]=k;
                        i++;
                       
                    } 
                }
            }
            
        }
        for (int i : a) {
            System.err.print(i);
        }

        
    }
    
}
