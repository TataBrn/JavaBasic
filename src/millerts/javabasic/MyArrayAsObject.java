package millerts.javabasic;

import java.util.Arrays;

/**
 * Выполните следующие действия с массивом:
 * 1. Задайте массив из 5 любых целых чисел
 * 2. Поменяйте местами первый и последний элемент в массиве
 * 3. Вывести в консоль результат суммы первого и среднего элемента
 * Примечание: Для получения последнего и среднего элементов в массиве используйте свойство length.
 */
public class MyArrayAsObject {
    public static void main(String[] args) {
        int[] theBestArray = new int[] {5, 3, 99, 4, 42};
        System.out.println("Первоначальный массив: " + Arrays.toString(theBestArray));

        //Меняем местами первый и последний элемент массива
        int x = theBestArray[0]; //буферная переменная для обмена
        theBestArray[0] = theBestArray[theBestArray.length-1];
        theBestArray[theBestArray.length-1] = x;
        System.out.println("Массив после обмена: " + Arrays.toString(theBestArray));

        //Выводим в консоль результат суммы первого и среднего элемента
        int sumElements;
        sumElements = theBestArray[0] + theBestArray[theBestArray.length/2];
        System.out.print("Сумма первого и среднего элемента: " + sumElements);
    }

}
