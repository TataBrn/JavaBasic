package millerts.javabasic;

import java.util.Scanner;

/**
 * Напишите программу:
  * 1. Ввести первое число с клавиатуры и записать его в строковую переменную.
  * 2. Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
  * 3. Сравнить 2 числа и вывести большее на экран
  * 4. Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
 */
public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //1.вводим первое число с клавиатуры
        System.out.print("Введи первое число (Если это дробное число, вводи через точку): ");
        String number1 = in.nextLine(); //Первое число

        //2.вводим второе число
        System.out.print("Введи второе число. Это должно быть целое число: ");
        int number2 = in.nextInt(); //Второе число

        //3.Сравниваем 2 числа и выводим большее
        System.out.println("Большее число - это " + Math.max(Double.parseDouble(number1), number2));

        //4. Выводим меньшее число, предварительно переконвертировав его в double
        System.out.println("Меньшее число - это  " + Math.min(Double.parseDouble(number1), (double) number2));
    }
}
