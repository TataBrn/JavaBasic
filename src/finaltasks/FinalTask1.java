package finaltasks;

import java.util.Scanner;

/**
 * Напишите программу конвертер валют.
 * Программа должна переводить рубли в доллары по текущему курсу.
 * Пользователь вводит текущий курс и количество рублей.
 * Итоговое значение должно быть округлено до двух знаков после запятой.
 * Пример для теста работы программы:
 * - Курс доллара: 67,55
 * - Количество рублей: 1000
 * - Итого: 14,80 долларов
 */
public class FinalTask1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Какой нынче курс? ");
        float exchangeRates = in.nextFloat(); //курс
        System.out.print("Сколько рублей? ");
        float numbersOfRubles = in.nextFloat(); //кол-во рублей
        float numbersOfDollars = numbersOfRubles / exchangeRates;
        System.out.print("Итого: ");
        System.out.printf("%6.2f долларов", numbersOfDollars);


    }
}
