package millerts.javabasic;

import java.util.Scanner;

/**
 * Написать программу, которая будет выполнять следующие действия:
 * 1. Ввести три числа с клавиатуры x, y, z
 * 2. Найти и вывести в консоль среднее арифметическое этих чисел
 * 3. Разделить среднее арифметическое на 2 и округлить в меньшую сторону
 * 4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
 */
public class Task4 {

    public static void main(String[] args) {
        float x, y, z; // Три числа

        //Вводим три числа с клавиатуры
        Scanner in = new Scanner(System.in);
        System.out.print("Введи число x: ");
        x = in.nextFloat();
        System.out.print("Введи число y: ");
        y = in.nextFloat();
        System.out.print("Введи число z: ");
        z = in.nextFloat();

        //Выводим среднее арифметическое в консоль
        float avgXYZ = (x + y + z) / 3;
        System.out.printf("%2$5.2f\n", "Среднее арифметическое чисел " + x + "," + y + "," + z + " равно ", avgXYZ);

        //Делим среднее арифметическое на 2 и округляем в меньшую сторону
        int r = (int)(avgXYZ / 2);
        System.out.print("Разделили среднее арифметичксое на 2 и округлили в меньшую сторону: " + r + "\n");

        //Если полученное число больше 3, выводим на экран сообщение "Программа выполнена корректно"
        if (r > 3) {
            System.out.println("Программа выполнена корректно!");
        }

    }

}

