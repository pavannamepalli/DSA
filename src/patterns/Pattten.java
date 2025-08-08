package patterns;

public class Pattten {

    public static void main(String[] args) {

        int n = 5;
        int totalRows = n + 4;
        for (int i = 1; i < totalRows; i++) {
            if (i < n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");

                }
                for (int k = 1; k < n - i; k++) {
                    System.out.print(" ");

                }

            } else if (i == n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }

            }else {

                for(int j = 1; j <(totalRows-i)+1 ; j++) {
                    System.out.print("*");
                }


                for(int j = 1; j <i-n ; j++) {
                    System.out.print(" ");
                }


            }
            System.out.println();
        }
    }
}
