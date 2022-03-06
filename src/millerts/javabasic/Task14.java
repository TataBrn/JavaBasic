package millerts.javabasic;

import java.util.Random;

/**
 * Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20.
 * Далее:
 * 1. Выведите максимальный и минимальный элемент массива.
 * 2. Из максимального и минимального значения выведите наибольшее по модулю.
 */
public class Task14 {
    public static void main(String[] args) {
        Random rand = new Random(); //объект случайных чисел;
        Integer [] myArray; //Объявили массив
        myArray = new Integer[15]; //инициализировали массив из 15 элементов;

        //заполняем массив случайными числами в диапазоне от -20 до 20
        // и выводим массив
        System.out.print("Массив чисел: ");
        for (int i = 0; i<15; i++){
            myArray[i] = rand.nextInt(40) - 20;
            System.out.print(myArray[i]+" ");
        }

        //ищем минимальный и максимальный элементы массива
        int min = myArray[0]; //минимальный элемент
        int max = myArray[0]; //максимальный элемент
        for (int i = 1; i < 15; i++){
            if (myArray[i] < min) {
                min = myArray[i];
            }
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        System.out.println("\nМинималный элемент массива: " + min);
        System.out.println("Максималный элемент массива: " + max);
        System.out.println("Из них наибольшее по модулю число: " + Math.max(Math.abs(min),Math.abs(max)));



    }
}
