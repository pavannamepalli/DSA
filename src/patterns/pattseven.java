package patterns;

public class pattseven {

    public static void main(String[] args) {

        int totalRows = 5;

        for (int i = 1; i <= totalRows; i++) {
            for (int j = 1; j<=totalRows-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=(i*2)-1 ; k++) {
                System.out.print("x");

            }
            System.out.println();

        }

    }
}
