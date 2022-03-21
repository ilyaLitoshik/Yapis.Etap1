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
        float percent = firstNumber%secondNumber;

        //Возведение числа firstNumber в степень secondNumber
        int pow = firstNumber^secondNumber;


        println(sum);
        println(dif);
        println(composition);
        println(divide);
        println(percent);
        println(pow);

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
