package millerts.javabasic;

import java.util.Arrays;

/**
 * Выполните следующие действия с массивом:
 * 1. Задайте массив из 5 любых целых чисел
 * 2. Поменяйте местами первый и последний элемент в массиве
 * 3. Вывести в консоль результат суммы первого и среднего элемента
 * Примечание: Для получения последнего и среднего элементов в массиве используйте свойство length.
 */
public class MyArray {
    public static void main(String[] args) {
        int x;
        int[] theBestArray = {5, 3, 99, 4, 42}; //Массив из 5 любых целых чисел
        System.out.print("Первоначальный массив: ");
        for (int i : theBestArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Меняем местами первый и последний элемент массива
        x = theBestArray[0]; //буферная переменная для обмена
        theBestArray[0] = theBestArray[theBestArray.length-1];
        theBestArray[theBestArray.length-1] = x;
        System.out.print("Массив после обмена: ");
        for (int i : theBestArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Выводим в консоль результат суммы первого и среднего элемента
        int sumElements;
        sumElements = theBestArray[0] + theBestArray[theBestArray.length/2];
        System.out.print("Сумма первого и среднего элемента:" + sumElements);
    }

}
