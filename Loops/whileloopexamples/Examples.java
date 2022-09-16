package whileloopexamples;
// Square of A
public class Examples {
    public static void main(String[] args) {
        int n = 0;
        while (n < 5) {
            int m = 0;
            while (m < 5) {
                int z = 0;
                while (z < 4) {
                    System.out.print("А");
                    z++;
                }
                System.out.print(" ");
                m++;
            }
            System.out.println();
            n++;
        }
    }
}
