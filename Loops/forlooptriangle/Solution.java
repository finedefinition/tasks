package forlooptriangle;


public class Solution {
    public static void main(String[] args) {

        int length = 0;
        for (int j = 0; j <= 10; j++) {
            for (int i = 0; i < length; i++)
                System.out.print(i);
            System.out.println();
            length++;
        }
    }
}


