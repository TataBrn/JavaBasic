package millerts.javabasic;

import java.util.Scanner;

/**
 * Напишите программу, где пользователь вводит любое целое положительное число n.
 * А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите любое целое положительное число: ");
        int number = in.nextInt();


        if (number > 0){
            System.out.print("Нечетные числа: ");
            int i = 1;
            int Sum = 0;
            do {
                Sum +=i;
                System.out.print(i + " ");
                i +=2;
            } while (i <= number);
            System.out.println("\nСумма всех нечетных чисел до числа " + number + " = " + Sum);
        }
        else{
            System.out.println("Это не положительное число");
        }
    }
}
