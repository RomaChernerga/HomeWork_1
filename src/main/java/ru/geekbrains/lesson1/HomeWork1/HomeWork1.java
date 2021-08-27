package ru.geekbrains.lesson1.HomeWork1;

public class HomeWork1 {

    public  static void main(String[] args) {  // Метод main не принимающий никаких значений
        arithmeticOperations();  // для запуска проверок арифметических операций
        printNumber(2);  //число для задания 5
        printNumber1(-5); // Переменная для задания 6
        printHello1("Рома");  // Переменная для задания 7
        Numbers4(10, 11);
        printYear(401);


        // Задание номер 2  Типы Данных
       byte byteVariable; //1 byte = 8bit. значения от -128...до 127
         byteVariable = 125;
       short shortVariable = 256; // 2 byte = 16 bit  -32768...32767
       int intVariable = 2_100_000_000; // 4 byte = 32 bit  - 2 100 000...2 100 000
        long longVariable = 2_200_000_000L; // 8byte = 64 bit
       char charVariable = 'w'; // Символьный тип переменных, 16bit  0...65535
        char charVariable1 = 65; // Символьный тип переменных
        char charVariable2 = '\u1123'; // Символьный тип переменных
       System.out.println(charVariable2);

        boolean booleanVariable = true;  //Логический тип данных
        boolean booleanVariable1 = (20 - 15) > 4; //Логический тип данных
        System.out.println(booleanVariable);

        double doubleVariable = 0.256;  //Число с плавающей точкой, 64bit
        float floatVariable = 2.3f; //Число с одинарной точностью, 32bit

        String stringVariable = "Hello";
        int result = byteVariable + shortVariable;
        System.out.println(result);

        String string1 = " my friend";
        String string2 = "!!!";
        System.out.println(stringVariable+string1+string2);  // Сложение строк

        // Задание номер 3.
        // Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        // где a, b, c, d – аргументы этого метода, имеющие тип float.
        float floatA = 5.3f;
        float floatB = 2.45f;
        float floatC = 3.1f;
        float floatD = 4f;
        float floatResult = floatA * (floatB + (floatC / floatD));
        System.out.println(floatResult);
    }
        // Задание номер 5.
        // Написать метод, которому в качестве параметра передается целое число,
        // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
        // Замечание: ноль считаем положительным числом.
    static void printNumber( int position) {
        if (position >= 0) {
            System.out.println("Положительно число");
        } else {
            System.out.println("Отрицательно число");
        }
    }

    // Задание номер 6.
    // Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    static void printNumber1(int position1) {
        boolean booleanNumb1 = (position1 < 0);
        System.out.println(booleanNumb1);
    }

    // Задание номер 7.
    // Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    static void printHello1( String name) {
    String stringHello = "Привет, ";
    String stringHello1 = "!";
    String result = stringHello + name + stringHello1;
    System.out.println(result);
}

    // Задание номер 8.
    // *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    static void printYear(int year){
        if (year % 400 ==0) {
            System.out.println("Данный год высокосный");
        } else if (year % 100 ==0) {
            System.out.println("Данный год невысокосный");
        } else if (year % 4 ==0){
            System.out.println("Данный год высокосный");
        }  else{
            System.out.println("Данный год невысокосный");
        }

    }


    // Задание номер 4. Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    static void Numbers4 (int Number41, int Number42) {
        boolean result41 = (Number41+Number42)>=10 && (Number41+Number42)<=20;
        System.out.println(result41);
    }


    

    static void arithmeticOperations(){
        System.out.println(10);   // Вывод 10
        System.out.println(10 + 12); // Вывод суммы чисел
        System.out.println(10 - 12); // Вывод разницы чисел
        System.out.println(12 * 11); // Вывод произведения чисел
        System.out.println(100 / 12); // Вывод деления чисел(без указания остатка)
        System.out.println(100 % 12); // Вывод ТОЛЬКО остатка при делении нацело
        System.out.println(6 ^ 2); // Исключающее ИЛИ
        System.out.println(6 == 2); // Сравнение переменных и вывод результата
        System.out.println(7 == 7); // Сравнение переменных и вывод результата
        System.out.println(7 > 6); // Сравнение переменных и вывод результата
        System.out.println(5 < 4); // Сравнение переменных и вывод результата
        System.out.println(7 >= 6); // Сравнение переменных и вывод результата
        System.out.println(7 <= 6); // Сравнение переменных и вывод результата
        System.out.println(2 <= 3 && 3 <= 4); // Объединение условий при логическом И
        System.out.println(2 <= 3 || 3 <= 2); // Объединение условий при логическом ИЛИ
        System.out.println(7 != 6); // Ирвертирование
    }



}

