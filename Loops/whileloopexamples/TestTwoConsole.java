package whileloopexamples;

import java.util.Scanner;

public class TestTwoConsole {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int min = console.nextInt();
        int secondMin = console.nextInt();
        int thirdMin = console.nextInt();
        int fourthMin = console.nextInt();

        System.out.println(min);
        System.out.println(secondMin);
        System.out.println(thirdMin);
        System.out.println(fourthMin);
    }
}
