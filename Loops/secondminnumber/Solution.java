package secondminnumber;

import java.util.Scanner;

/*
В этой задаче нужно:

Считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка или символ.
Должно быть введено минимум два числа. Если введено меньше двух целых чисел, то такую ситуацию обрабатывать не нужно, а программа может быть завершена с ошибкой.
Вывести на экран второе по величине целое число после минимального из введенных с клавиатуры. Если таких чисел несколько, то необходимо вывести любое из них.
Минимальных чисел тоже может быть несколько.
Пример ввода:
8
4 // минимальное число
7
4 // минимальное число
5 // второе по величине число (второе минимальное)
9
5 // второе по величине число (второе минимальное)
exit
Пример вывода:
5

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить число на экран.
•	Программа должна выводить на экран второе минимальное из введенных целых чисел.
•	Если введено несколько вторых минимальных чисел, необходимо вывести любое.
•	Считывать данные с клавиатуры необходимо в цикле while.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int minNumber = console.nextInt();
        int secondMinNumber = console.nextInt();

        if (secondMinNumber < minNumber) { // {2, 1}
            int tmp = secondMinNumber;
            secondMinNumber = minNumber;
            minNumber = tmp;
        }
        while (console.hasNextInt()) {
            int x = console.nextInt();
            if (minNumber == secondMinNumber) {
                if (x < minNumber) {  // {2, 2, 1}
                    minNumber = x;
                } else {
                    secondMinNumber = x;
                }

            } else if (x < minNumber) { // {2, 2, 3}
                secondMinNumber = minNumber;
                minNumber = x;
            } else if (x > minNumber && x < secondMinNumber) { // {1, 3, 2}
                secondMinNumber = x;
            }
        }
        System.out.println(secondMinNumber);

    }
}
