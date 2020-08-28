package ru.eremin_dmitrii.lesson1;

public class lesson1_Eremin_Dmitrii {

    // 1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
    public static void main (String[] args)
    {

        primitiveDataType((byte) -128, (short) 32767, -2147483648,9223372036854775807L, 2.15f, 2.38, '*', true);

        System.out.println ("Задание 3: a * (b + (c / d)) = " + Calculate(10,5,10,5));

        System.out.println("Задание 4: ((a + b > 10) && (a + b <= 20)): " + lessOrMore(5.16,6.24));

        System.out.println("Задание 5: Число а положительное или отрицательное? Замечание: ноль считаем положительным числом.");
        plusOrMinus(1);
        plusOrMinus(-5);

        System.out.println("Задание 6: ");
        System.out.println(isMinus(-5));
        System.out.println(isMinus(5));
        System.out.println(isMinus(0));

        System.out.println("Задание 7: метод должен вывести в консоль сообщение «Привет, указанное_имя!»");
        helloName("Вася");
        helloName("Петя");

        System.out.println("Задание 8: Определить високосный год? ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))");
        leapYear(1900);
        leapYear(2000);
        leapYear(2019);
        leapYear(2020);

    }

    // 2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
    static void primitiveDataType(byte b, short s, int i, long l, float f, double d, char c, boolean bool)
    {
        System.out.println("Примитивные типы данных: \n"
                + "1. Целочисленный: 8-битное знаковое целое число от -128 до 127. byte = " + b + ",\n"
                + "2. Целочисленный: 16-битное знаковое целое число от -32768 до 32767. short = " + s + ",\n"
                + "3. Целочисленный: 32-битное знаковое целое число от -2147483648 до 2147483647. int = " + i + ",\n"
                + "4. Целочисленный: 64-битное знаковое целое число от -9223372036854775808 до 9223372036854775807. long = " + l + ",\n"
                + "5. Плавающая точка: 32-битное знаковое число с плавающей запятой одинарной точности. float = " + f + ",\n"
                + "6. Плавающая точка: 64-битное знаковое число с плавающей запятой двойной точности. double = " + d + ",\n"
                + "7. Символьный тип: 16-битный тип данных, предназначенный для хранения символов в кодировке Unicode от '\\u0000' или " +
                "0 до '\\uffff' или 65,535. char = " + c + ",\n"
                + "8. Логический тип: логический тип данных либо false либо true. boolean = " + bool + ".");
    }

    //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d –
    //входные параметры этого метода;
    static int Calculate (int a, int b, int c, int d)
    {
        return a * (b + (c / d));
    }

    /*
    4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
    если да – вернуть true, в противном случае – false;
    */

    static boolean lessOrMore (double a, double b)
    {
        if ((a + b > 10.0) && (a + b <= 20.0))
        {
        return true;
        }
        else
            {
        return false;
        }
    }

    //    5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль
    // положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.

    static void plusOrMinus (int a)
    {
        if (a >= 0)
        {
            System.out.println("Число a = " + a + " положительное.");
        }
        else if (a < 0)
            {
            System.out.println("Число a = " + a + " отрицательное.");
        }
    }

    //  6. Написать метод, которому в качестве параметра передается целое число,
    //метод должен вернуть true, если число отрицательное;

    static boolean isMinus (int a)
    {
        System.out.print("Число a = " + a + " отрицательное? ");
        if (a == 0)
        {
            System.out.println("Число ноль отделяет положительные и отрицательные числа");
        }
        return a < 0 ? true : false;
    }

    //    7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    //метод должен вывести в консоль сообщение «Привет, указанное_имя!»;

    static void helloName (String name) {
        System.out.println("Привет, " + name + "!");
    }

    /*
    8. * Написать метод, который определяет является ли год високосным,
    и выводит сообщение в консоль. Каждый 4-й год является високосным,
    кроме каждого 100-го, при этом каждый 400-й – високосный.
    */

    static boolean leapYear (int year)
    {
        boolean x = true;
        if (((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)))
        {
            System.out.println("Год " + year + " високосный: " + x);
            return x;
        }
        else
            {
                x = false;
                System.out.println("Год " + year + " високосный: " + x);
                return x;
        }
    }

}

