package secondminnumber;

import java.util.Scanner;

/*
Второе минимальное число из введенных
*/

public class ProperSolution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in); // Запускаем Сканер

        int min = console.nextInt();  // первая переменная из сканера {2}
        int secondMin = console.nextInt(); // вторая переменная из сканера {2}
        if (secondMin < min) { //замена значений если первая переменная больше {2, 1}
            int tmp = min; // создание временной переменной для записи tmp = 2;
            min = secondMin; // перезапись min1 min = 1;
            secondMin = tmp; // перезапись min2 min2 = 2;
        }
        while (console.hasNextInt()) { //условие выхода из цикла если не инт
            int x = console.nextInt(); //третяя переменная из сканера
            if (min == secondMin) { //условие для х если мин1 и мин2 равны. { 2, 2, 3}
                if (x < min) { //перезапись min1 {1, 2, 2}
                    min = x;
                } else {
                    secondMin = x; //перезапись min2 { 2, 2, 3}
                }
            } else if (x < min) { //перезапись { 2, 3, 1}
                secondMin = min;
                min = x;
            } else if (x > min && x < secondMin) { //перезапись { 2, 4, 3}
                secondMin = x;
            }
        }
        System.out.println(secondMin);
    }
}
