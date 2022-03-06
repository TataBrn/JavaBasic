package millerts.javabasic;

import java.util.Scanner;

/**
 * Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами.
 * Например: “I love java 8 Я люблю java 14 core1”. Выполните следующие действия:
 * 1. Выведите слова, состоящие только из латиницы.
 * 2. Выведите количество этих слов.
 */
public class Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //вводим строку
        System.out.print("Введи строку из слов, разделенных пробелами: ");
        String myString = in.nextLine();

        //делим строку на массив строк
        String [] myStringArray = myString.split(" ");//массив строк

        //Ищем слова, состоящие только из латиницы и считаем их
        int wordsAmount = 0; //кол-во слов, состоящих только из латиницы
        System.out.println("Слова, состоящие  только из латиницы:");
        for (String word : myStringArray){ //перебираем слова в массиве
            boolean isLatin = true; //флаг - слово состоит только из латиницы
            for (int i = 0; i<word.length(); i++){ //перебираем символы в очередном слове
                //если очередной символ слова - НЕ символ латиницы
                // то isLatin присваиваем false и прерываем цикл
                if (!(Character.UnicodeBlock.of(word.charAt(i)).equals(Character.UnicodeBlock.BASIC_LATIN)) ||
                    Character.isDigit(word.charAt(i))) {
                    isLatin = false;
                    break;
                }
            }
            if (isLatin) { //если слово состоит из латиницы, выводим его и считаем
                System.out.println(word);
                wordsAmount++; // счетчик слов из латиницы
            }
        }
        System.out.println("Таких слов - " + wordsAmount);
    }
}
