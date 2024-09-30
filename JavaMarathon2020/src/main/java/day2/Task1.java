package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int floorNumber = scan.nextInt();

        if(floorNumber <= 0){
            System.out.println("Ошибка ввода");
        }
        else if (floorNumber <= 4){
            System.out.println("Малоэтажный дом");
        }
        else if(floorNumber >= 5 && floorNumber <= 8){
            System.out.println("Среднеэтажный дом");
        }
        else if(floorNumber >= 9){
            System.out.println("Многоэтажный дом");
        }
    }
}