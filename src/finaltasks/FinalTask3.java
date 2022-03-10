package finaltasks;

import java.util.Scanner;

/**
 * Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки.
 * Среди данных строк найти строку с максимальным количеством различных символов.
 * Если таких строк будет много, то вывести первую.
 * Пример для теста работы программы:
  * Количество строк: 3
 * Строка 1: привет
 * Строка 2: анализ
 * Строка 3: 111111111111
 * Ответ: привет
 */
public class FinalTask3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String maxString = ""; //строка с максимальным кол-ом разных символов
        String nextString; //очередная строка
        int maxSymbol = 0; //максимальное кол-во разных символов
        int simbolCount; // кол-во разных символов в очереднйо строке

        System.out.print("Сколько будет строк? ");
        int stringCount = in.nextInt(); //кол-во строк
        in.nextLine();
        //если ввели адекватное кол-во строк
        if (stringCount > 0) {
            for (int i = 1; i <= stringCount; i++) {
                //вводим очередную строку
                System.out.print("Введи " + i + "-ую строку: ");
                nextString = in.nextLine();
                //ищем кол-во разных символов в очередной строке
                simbolCount = 0;
                for (int j = 0; j < nextString.length(); j++) { //перебираем все символы строки
                    //если очередной символ больше не встречается в строке
                    if (nextString.substring(j + 1).indexOf(nextString.charAt(j)) == -1) {
                        simbolCount++; //считаем его
                    }
                }
                //ищем максимальное кол-во символов среди только что найденного и максимального (на данный момент)
                if (simbolCount > maxSymbol) {
                    maxString = nextString;
                    maxSymbol = simbolCount;
                }
//                System.out.println("В этйо строке " + simbolCount + "разных символов");

            }
            System.out.println("Ответ: " + maxString);
        }
        //если кол-во строк <=0
        else {
            System.out.println("Не бывает такого кол-ва строк.");
        }
    }
}
