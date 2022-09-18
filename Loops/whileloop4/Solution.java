package whileloop4;

/*
Используя вложенные циклы while (цикл в цикле) выведи на экран незаполненный
прямоугольник (его контур) размером 10 (высота) на 20 (ширина) из букв 'Б'.
Незаполненная часть состоит из пробелов.

Пример вывода:
ББББББББББББББББББББ
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
ББББББББББББББББББББ

Требования:
Программа должна выводить текст на экран.
•	Программа должна выводить контур прямоугольника высотой 10 и шириной 20 из буквы 'Б'.
•	В программе необходимо использовать вложенные циклы while (цикл в цикле).
•	Вывод на экран должен происходить в цикле while.
*/

public class Solution {
    public static void main(String[] args) {
        int firstStringB = 0;
        while (firstStringB < 20) {
            System.out.print("B");
            firstStringB++;
        }
        System.out.println();
        int length = 0;
        while (length < 8) {
            int lastLetterB = 0;
            while (lastLetterB < 1) {
                int firstLetterB = 0;
                while (firstLetterB < 1) {
                    System.out.print("B");
                    firstLetterB++;
                    int spaces = 0;
                    while (spaces < 18) {
                        System.out.print(" ");
                        spaces++;
                    }
                }
                System.out.print("B");
                lastLetterB++;
            }
            System.out.println();
            length++;
        }
        int lastStringB = 0;
        while (lastStringB < 20) {
            System.out.print("B");
            lastStringB++;
        }
    }
}


