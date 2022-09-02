package com.company;

public class Main {

    public static void main(String[] args) {
	// Задание 1.
        int i = 0;
        while (i < 10){
	    i++;
    }
        System.out.println(" ");
        for (i = 10; i > 0; i--){
        System.out.println(i);
        }
        // Задание 2.
        System.out.println("Задание 2");
        int friday = 5;
        for (; friday <= 31;  friday = friday + 7 ){
            System.out.println("Сегодня пятница, " + friday + "e число. Необходимо подготовить отчет.");
        }
        // Задание 3.
           System.out.println("Задание 3");
        int cometYear = 2021;
        int Before200year = (cometYear - ( cometYear %79) -79);
        int After100year = Before200year + 79*2;
        for (i = Before200year; i <= After100year; i = i+ 79 ){
            System.out.println("Комета прилетает в " + i + " году.");
       }
        // Задание 4.
        System.out.println("Задание 4");


    }
}
