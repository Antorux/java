package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x,y;

        while(true) {
            x = scan.nextDouble();
            y = scan.nextDouble();

            if (y == 0) {
                break;
            }

            System.out.print(x / y + "\n");
        }
    }
}

