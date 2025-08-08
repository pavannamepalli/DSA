package patterns;

public class pattele {

    public static void main(String[] args) {

        int n =5;
        for (int i = 0; i <n; i++) {
            int value;
            if(i%2 ==0){
                value = 0;
            }else{
                value = 1;
            }
            for (int j = 0; j <=i ; j++) {

                value =1-value;
                System.out.print(value + " ");

            }
            System.out.println();
        }
    }
}
