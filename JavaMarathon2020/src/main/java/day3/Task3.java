package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double x,y;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            x = scan.nextDouble();
            y = scan.nextDouble();

            if(y == 0){
                System.out.print("Деление на 0\n");
                continue;
            }
            System.out.print(x / y + "\n");
        }
    }
}

/* Реализовать программу, которая 5 раз запрашивает от пользователя два числа -
делимое и делитель. Для этих двух чисел программа рассчитывает результат деления
и выводит его в консоль. Если пользователь вводит 0 в качестве делителя, вместо
того, чтобы останавливать работу цикла принудительно, мы пропускаем итерацию и
выводим в консоль сообщение “Деление на 0”.
Ключевое слово else использовать в этой программе нельзя. */