package millerts.javabasic;

import java.util.Scanner;

/**
 * Напишите программу:
 * 1. Пользователь вводит размер массива и данные с клавиатуры в массив
 * 2. Сравнить элементы массива с заранее заданными константами x, y, z.
 * 3. Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
 */
public class Task7 {
    public static void main(String[] args) {

        //задаем константы
        final int x = 4;
        final int y = 55;
        final int z = 6;

        System.out.print("Введите размер массива: ");
        Scanner in = new Scanner(System.in);
        byte elementsAmount = in.nextByte(); // кол-во элементо вв массиве

        int [] myArray = new int[elementsAmount]; //массив

        // вводим элементы массива
        for (int i = 0; i < elementsAmount; i++) {
            System.out.print("Введите " + i + "-й элемент массива: ");
            myArray[i] = in.nextInt();
        }

        //ищем константы в массиве
        for (int element : myArray){
            if (element == x ||  element ==y || element == z){
                System.out.println("Значение " + element + " имеется в константах");
                break;
            }
        }
    }
}
