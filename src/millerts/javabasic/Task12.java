package millerts.javabasic;

import java.util.Locale;

/**
 * Напишите программу, принимающую на вход строку “I like Java!!!”, которая будет выполнять следующие действия:
 * 1. Проверить, содержит ли строка подстроку “Java” (используйте contains()).
 * 2. Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
 * 3. Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
 * 4. Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
 * 5. Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран (используйте substring()).
 */
public class Task12 {
    public static void main(String[] args) {
        String mainString = "I like Java!!!"; //Строка, которую принимают на вход

        //1. Проверяем, содержит ли строка подстроку “Java”
        if (mainString.contains("Java")){
            System.out.println("Строка содержит подстроку 'Java'");
        }
        else {
            System.out.println("Строка не содержит подстроку 'Java'");
        }

        //2. Проверяем, начинается ли строка с подстроки “I like”
        if (mainString.startsWith("I like")){
            System.out.println("Строка начинается с 'I like'");
        }
        else {
            System.out.println("Строка не начинается с 'I like'");
        }

        //3. Проверяем, заканчивается ли строка  подстрокой “!!!”
        if (mainString.endsWith("!!!")){
            System.out.println("Строка заканчивается на '!!!'");
        }
        else {
            System.out.println("Строка не заканчивается на '!!!'");
        }

        //4. Если 3 предыдущих условия верны, выводим данную строку, преобразованную к верхнему регистру.
        if ((mainString.startsWith("I like")) & (mainString.startsWith("I like")) & (mainString.contains("Java"))) {
            System.out.println("Строка в верхнем регистре: " + mainString.toUpperCase());
        }

        //5.Заменяем все символы ‘a’ на ‘о’ и выводим подстроку “Jovo” на экран
        mainString = mainString.replace('a', 'o');
        System.out.println(mainString.substring(7, 11));


    }
}

