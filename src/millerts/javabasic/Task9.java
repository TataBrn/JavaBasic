package millerts.javabasic;

import java.util.Scanner;

/**
 * Напишите программу:
 * 1. Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
 * 2. Посчитайте среднее арифметическое элементов массива.
 * 3. После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
 */
public class Task9 {
    public static void main(String[] args) {

        //вводим размер массива
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int elementsAmount = in.nextInt();

        //Проверяем размерность массива
        if (elementsAmount > 0){ // Если разменость массива норм
            double [] myArray = new double[elementsAmount];

            //вводим элементы массива
            for (int i = 0; i < elementsAmount; i++){
                System.out.print("Введи " + i + "-й элемент массива: ");
                myArray[i] = in.nextDouble();
            }

            //считаем среднее арифметическое
            double S = 0; // сумма элементов
            for (double number : myArray){
                S +=number;
            }
            double avg = S / elementsAmount; //среднее арифметическое
            System.out.println("Среднее арифметическое: " + avg);

            //выводим исходный массив
            System.out.println("Исходный массив: ");
            for (double elements : myArray ){
                System.out.printf("%8.2f", elements);
            }
            //выводим исходный массив
            System.out.println("\nЭлементы массива, умноженные на среднее арифметическое: ");
            for (double elements : myArray ){
                System.out.printf("%8.2f", elements * avg);
            }
        }
        else{ //если размерность массива не норм
            System.out.println("Не бывает массивов такого размера");
        }


    }
}
