public class ZeroMoverV2 {

    public static void main(String[] args) {
        int[] a = { 1, 2, 0, 1, 0, 4, 0 };

        int index = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] != 0) {
                a[index] = a[i];
                index++;

            }

            

        }
        for (int j = index; j < a.length; j++) {
                a[j] = 0;
                
            }

           for (int i : a) {
             System.out.println(i);
           }

    }

}
