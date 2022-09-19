package whileloopexamples;
/*
Давайте напишем программу, которая вводит числа с клавиатуры (пока пользователь вводит что-то похожее на числа)
 и выводит на экран их сумму. Вот как будет выглядеть код такой программы
 */
import java.util.Scanner;

public class GetMaxFromConsole {

        public static void main(String[] args) {
                Scanner console = new Scanner(System.in);
                int max = Integer.MIN_VALUE;
                while (console.hasNextInt()) {
                        int x = console.nextInt();
                        if (x > max)
                                max = x;
                }
                System.out.println(max);
        }
}
