package forloopprimitive;

public class Solution {
    public static void main(String[] args) {
        {
            int i = 1;
            while (i < 15) {
                System.out.print(i + ", ");
                i++;
            }
            System.out.println(i + "EndOfWhile");
        }
        for (int i = 1; i <= 15; i++) {
            {
                if (i < 15)
                    System.out.print(i + ", ");
                if (i == 15)
                    System.out.println(i + "EndOfWhile");
            }
        }
        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0)
                System.out.println(i);

        }
    }
}

