package patterns;

public class patteight {

    public static void main(String[] args) {

        int totalRows = 5;

        for (int i = 1; i <= totalRows; i++) {
            for (int j = 1; j<(i-1); j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <=(2 * (totalRows - i)) + 1 ; k++) {
                System.out.print("x");

            }
            System.out.println();

        }

    }
}
