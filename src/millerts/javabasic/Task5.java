package millerts.javabasic;

import java.io.IOException;
import java.util.Scanner;

/**
 * Напишите простой калькулятор:
 * 1. Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’
 * 2. В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
 */
public class Task5 {
    public static void main(String[] args) throws IOException {
        float num1, num2; //2 числа
        float result; //результат операции
        char op; //символ операции

        //запрашиваем числа
        Scanner in = new Scanner(System.in);
        System.out.print("Введи первое число: ");
        num1 = in.nextFloat();
        System.out.print("Введи второе число: ");
        num2 = in.nextFloat();

        //запрашиваем операцию
        System.out.print("Введи символ опеарции +,  -, * или /: ");
        int x = System.in.read();
        op = (char) x;

        //проверяем, что ввели корректный символ
        result = 0;
        if ((op == '+') || (op == '-') || (op == '*') || (op == '/')) {
            //Если символ ввели верно, то выполняем операцию
            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            //Выводим результат
            System.out.println(num1 + " "+ op + " " + num2 + " = " + result);
        }
        //Если ввели неправильный символ, выводи сообщение об этом
        else {
            System.out.println("Нет такой операции");
        }


    }
}
