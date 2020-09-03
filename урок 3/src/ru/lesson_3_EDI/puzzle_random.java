package ru.lesson_3_EDI;
import java.util.*;

/*
Домашнее задание
        Написать программу, которая загадывает случайное число от 0 до 9
        и пользователю дается 3 попытки угадать это число.
        При каждой попытке компьютер должен сообщить,
        больше ли указанное пользователем число, чем загаданное, или меньше.
        После победы или проигрыша выводится запрос – «Повторить игру еще раз?
        1 – да / 0 – нет»
        (1 – повторить, 0 – нет).
*/


public class puzzle_random {
    private static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        int startNumberOfTry = 3;
        startGame(startNumberOfTry, guessNumber());
    }

    //Старт игры
    private static void startGame(int startNumberOfTry, int answer) {
        int numberOfTry = startNumberOfTry;
        while (numberOfTry > 0)
        {
            numberOfTry--;
            int userAnswer = userInput(0,9);
            if (isCheckUserInput(answer,userInput(0,9)) == true || numberOfTry == 0)
            {
                if (numberOfTry == 0)
                {
                System.out.println("Вы использовали все попытки, загаданное число: " + answer);
                }

                numberOfTry = 0;
                tryAgain(startNumberOfTry);
            }
        }
    }

    //повтор игры
    private static void tryAgain(int startNumberOfTry) {
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        switch (userInput(0,1))
        {
            case 0:
            {
                System.out.println("Пока!");
                break;
            }
            case 1:
            {
                System.out.println("Начнем!");
                startGame(startNumberOfTry, guessNumber());
                break;
            }
            default:
            {
            break;
            }
        }
    }

    //проверка ответа пользователя
    private static boolean isCheckUserInput(int answer, int userAnswer)
    {
        boolean res = false;
            if (userAnswer == answer)
            {
                res = true;
                System.out.println("Вы победили!!! загаданное число: " + answer);
            }
            else if (answer > userAnswer)
            {
                res = false;
                System.out.println("Загаданное число > " + userAnswer);
            }
            else
            {
                res = false;
                System.out.println("Загаданное число < " + userAnswer);
            }
            return res;
    }

    //компьютер загадывает число от 0 до 9 включительно
    private static int guessNumber()
    {
        int number = (int) (Math.random() * 10);
        return number;
    }

    //ввод данных типа int пользователем
    private static int userInput(int startData, int stopData)
    {
        int num;
        do
        {
        System.out.println("Введите число от " + startData + " до " + stopData + " :");
        num = in.nextInt();
        } while (!isValid(num,startData,stopData));
        return num;
    }

    //проверка значений в пределах пользовательского ввода
    private static boolean isValid(int num, int startData, int stopData)
    {
        boolean res = false;
        if ((num >= startData) && (num <= stopData))
        {
            res = true;
        }
        else {System.out.println("Введено некорректное значение"); }
        return res;
    }

}
