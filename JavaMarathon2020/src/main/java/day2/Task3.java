package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        while(a <= b){
            if((a % 5 == 0) && !(a % 10 == 0)){
                System.out.printf(a + " ");
            }
            a++;
        }
    }
}
