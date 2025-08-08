package patterns;

public class patt5teen {

    public static void main(String[] args) {



        for (int i = 5; i > 0; --i) {
            int k = 65;
            for (int j = 1; j <= i; j++) {

                System.out.print((char) k++ + "");

            }
            System.out.println();
        }
    }
}
