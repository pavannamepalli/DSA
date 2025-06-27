public class InPlaceDuplicateRemover {

    public static void main(String[] args) {

        int[] arr = { 1, 1, 2, 2, 2, 3, 3 };

        int i = 0,k=0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
            k=i+1;
        }

        for (int j = 0; j < k; j++) {
            System.out.println(arr[j]);
        }
    }

}
