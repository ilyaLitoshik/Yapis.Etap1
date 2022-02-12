package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int firstNumber, secondNumber;
        Scanner S = new Scanner(System.in);
        firstNumber = S.nextInt();
        secondNumber = S.nextInt();
        //Операция +
        int sum = firstNumber + secondNumber;

        //Операция -
        int dif = firstNumber - secondNumber;

        //Операция *
        int composition = firstNumber * secondNumber;

        //Преобразование типов, Операция /
        float divide = (float) firstNumber/ (float) secondNumber;

        //Расчёт процента firstNumber от secondNumber
        float percent = (float) firstNumber*100/ (float) secondNumber;

        //Возведение числа firstNumber в степень secondNumber
        int pow = 1;
        for (int i = 1; i <= secondNumber; i++) {
            pow = pow * firstNumber;
        }


        System.out.println(sum);
        System.out.println(dif);
        System.out.println(composition);
        System.out.println(divide);
        System.out.println(percent);
        System.out.println(pow);

        //if-then-else, != , >= , <=
        if (firstNumber != secondNumber) {
            System.out.println("Первое != Второму");
            if (firstNumber >= secondNumber){
                System.out.println("Первое больше или равно второму");
            } else if (firstNumber <= secondNumber){
                System.out.println("Первое меньше или равно второму");
            } else {
                System.out.println("Ошибка");
            }
        }


        //if-then-else, == , > , <
        if (firstNumber == secondNumber) {
            System.out.println("Первое = Второму");
        } else if (firstNumber > secondNumber){
            System.out.println("Первое больше второго");
        } else if (firstNumber < secondNumber){
            System.out.println("Первое меньше второго");
        } else {
            System.out.println("Ошибка");
        }


    }
}
