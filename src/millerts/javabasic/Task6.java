package millerts.javabasic;

import java.util.Scanner;

/**
 * Напишите программу конвертер физических величин:
 * 1. Пользователю предлагается на выбор ввести массу или расстояние. Пример:
 * > Выберите что переводить: 1 - масса, 2 - расстояние
 * > 2
 * 2. Пользователю предлагается выбрать единицу измерения. Пример:
 * > Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут
 * > 1
 * 3. Пользователю предлагается ввести количество выбранных единиц:
 * > Введите число
 * > 10
 * > Результат:
 * > Метры: 10
 * > Мили: 0.006
 * > Ярды: 10.94
 * > Футы: 32.81
 */
public class Task6 {
    public static void main(String[] args) {

        byte val1,val2; //параметры выбора
        float value; //кол-во выбранных единиц
        float m1 = 0, m2 = 0, m3 = 0, m4 = 0; // храним разные величины массы
        float s1 = 0, s2 = 0, s3 = 0, s4 = 0; // храним разные величины расстояния


        Scanner in = new Scanner(System.in);

        //Предлагаем ввести массу или расстояние
        System.out.println("Что ты хочшь конвертировать: массу или расстояние?");
        System.out.println("Если массу - напиши 1. Если расстояние - напиши 2.");
        val1 = in.nextByte();

        //если выбрал массу
        if (val1 == 1){
            //предлагаем выбрать единицу измерения
            System.out.println("Выбери единицу измерения:");
            System.out.println("1 - кг, 2 - пуд, 3 - стоун, 4 - фунт");
            val2 = in.nextByte();

            //если ввел число от 1 до 4
            if (val2 >= 1 & val2 <= 4) {
                //предлагаем ввести кол-во выбранных единиц
                System.out.println("Введи кол-во единиц:");
                value = in.nextByte();

                //переводим выбранные единицы измерения во все остальные
                switch (val2) {
                    case 1: //если выбрали кг
                        m1 = value; //кг
                        m2 = value / 16.381f; //пуд
                        m3 = value / 6.35f; //стоун
                        m4 = value * 2.205f; //фунт
                        break;
                    case 2: //если выбрали пуд
                        m1 = value * 16.381f; //кг
                        m2 = value; //пуд
                        m3 = value * 2.58f; //стоун
                        m4 = value * 36.113f; //фунт
                        break;
                    case 3: //если выбрали стоун
                        m1 = value * 6.35f; //кг
                        m2 = value / 2.58f; //пуд
                        m3 = value; //стоун
                        m4 = value * 14f; //фунт
                        break;
                    case 4: //если выбрали фунт
                        m1 = value / 2.205f; //кг
                        m2 = value / 36.113f; //пуд
                        m3 = value / 14f; //стоун
                        m4 = value; //фунт
                        break;
                }
                System.out.println("Результат:");
                System.out.println("Кг: " + m1);
                System.out.println("Пуды: " + m2);
                System.out.println("Стоуны: " + m3);
                System.out.println("Фунты: " + m4);
            }
            else{
                System.out.println("Нет такой единицы измерения");
            }
        }
        //если выбрал расстояние
        else if (val1 == 2){
            //предлагаем выбрать единицу измерения
            System.out.println("Выбери единицу измерения:");
            System.out.println("1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            val2 = in.nextByte();

            //если ввел число от 1 до 4
            if (val2 >= 1 & val2 <= 4) {
                //предлагаем ввести кол-во выбранных единиц
                System.out.println("Введи кол-во единиц:");
                value = in.nextByte();

                //переводим выбранные единицы измерения во все остальные
                switch (val2) {
                    case 1: //если выбрали метр
                        s1 = value; //метр
                        s2 = value / 1609f; //миля
                        s3 = value * 1.094f; //ярд
                        s4 = value * 3.281f; //фут
                        break;
                    case 2: //если выбрали милю
                        s1 = value * 1609f; //метр
                        s2 = value; //миля
                        s3 = value * 1760f; //ярд
                        s4 = value * 5280f; //фут
                        break;
                    case 3: //если выбрали ярд
                        s1 = value / 1.094f; //метр
                        s2 = value / 1760f; //миля
                        s3 = value; //ярд
                        s4 = value * 3f; //фут
                        break;
                    case 4: //если выбрали фут
                        s1 = value / 3.281f; //метр
                        s2 = value / 5280f; //миля
                        s3 = value / 3f; //ярд
                        s4 = value; //фут
                        break;
                }
                System.out.println("Результат:");
                System.out.println("Метры: " + s1);
                System.out.println("Мили: " + s2);
                System.out.println("Ярды: " + s3);
                System.out.println("Футы: " + s4);
            }
            else{
                System.out.println("Нет такой единицы измерения");
            }

        }
        //если выбрал что-то другое
        else {
            System.out.println("Нет такого варианта");
        }


    }
}
