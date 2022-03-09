package finaltasks;

import java.util.Scanner;

/**
 * Напишите программу, которая позволит решить простое уравнение относительно x. Программа принимает на вход строку длиной 5 символов.
 * Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
 * Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке.
 * Нужно найти неизвестное.
 * Пример для теста работы программы:
 * - Ввод: x+5=7
 * - Вывод: 2
 * - Ввод: 3-x=9
 * - Вывод: -6
 * - Ввод: 3-3=x
 * - Вывод: 0
 */

public class FinalTask2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Вводим уравнение
        System.out.println("Введите уравнение: ");
        // строка с уравнением
        String myEquation = in.nextLine();

        int x; //корень уравнения

        switch (myEquation.indexOf('x')){
            case 0: //x на первом месте
                if (myEquation.charAt(1) == '+') {
                    x = Integer.valueOf(myEquation.substring(4)) - Integer.valueOf(myEquation.substring(2,3));
                    System.out.println("x = "+ x);
                }
                else if (myEquation.charAt(1) == '-'){
                    x = Integer.valueOf(myEquation.substring(4)) + Integer.valueOf(myEquation.substring(2,3));
                    System.out.println("x = "+ x);
                }
                else {
                    System.out.println("Что-то пошло не так...");
                }
                break;
            case 2: //x на третьем месте
                if (myEquation.charAt(1) == '+') {
                    x = Integer.valueOf(myEquation.substring(4)) - Integer.valueOf(myEquation.substring(0,1));
                    System.out.println("x = "+ x);
                }
                else if (myEquation.charAt(1) == '-'){
                    x = Integer.valueOf(myEquation.substring(0,1)) - Integer.valueOf(myEquation.substring(4));
                    System.out.println("x = "+ x);
                }
                else {
                    System.out.println("Что-то пошло не так...");
                }
                break;
            case 4: //x на пятом месте
                if (myEquation.charAt(1) == '+') {
                    x = Integer.valueOf(myEquation.substring(0,1)) + Integer.valueOf(myEquation.substring(2,3));
                    System.out.println("x = "+ x);
                }
                else if (myEquation.charAt(1) == '-'){
                    x = Integer.valueOf(myEquation.substring(0,1)) - Integer.valueOf(myEquation.substring(2,3));
                    System.out.println("x = "+ x);
                }
                else {
                    System.out.println("Что-то пошло не так...");
                }
                break;
            default:
                System.out.println("Это не похоже на уравнение...");
                break;
        }


    }
}
