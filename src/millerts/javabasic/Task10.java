package millerts.javabasic;

import java.util.Scanner;

/**
 * Напишите программу, где пользователь вводит данные с клавиатуры в матрицу,
 * а после этого произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3.
 * Размерность матрицы задается пользователем.
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Вводим размерность матрицы
        System.out.print("Сколько строк в матрице? ");
        int rowAmount = in.nextInt(); //кол-во строк
        System.out.print("Сколько столбцов в матрице? ");
        int columnAmount = in.nextInt(); //кол-во столбцов

        if (rowAmount > 0 & columnAmount >0){ //если кол-во элементов ввели правильно
            int [][] myArray = new int[rowAmount][columnAmount]; //массив
            //вводим элементы массива
            for (int row = 0; row < rowAmount; row++){
                System.out.println("Элементы " + (row + 1) + "-й строки: ");
                for (int column = 0; column < columnAmount; column++){
                    System.out.print("Элемент " + (column + 1) + "-го столбца: ");
                    myArray[row][column] = in.nextInt();
                }
            }

            //выводим исходный массив
            System.out.println("Исходная матрица:");
            for (int row = 0; row < rowAmount; row++){
                for (int column = 0; column < columnAmount; column++ ){
                    System.out.printf("%6d", myArray[row][column]);
                }
                System.out.print("\n");
            }

            //выводим элементы первой строки матрицы, умноженные на 3
            System.out.println("Элементы первой строки, умноженные на 3:");
            for (int element : myArray[0] ){
                System.out.printf("%6d", element * 3);
            }
        }
        else { //если кол-во элементов вели неправильно
            System.out.println("Что-то не так с кол-ом элементов в матрице");
        }
    }
}
