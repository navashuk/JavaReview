package review4;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        int a = 0;
        while (a <= 3) {
            System.out.println("lets go");
            a++;
        }

        System.out.println("--------");
        int b = 1;
        do {
            System.out.println("do while");
            b++;
        } while (b <= 3);

        System.out.println("-------");


        Scanner scan = new Scanner(System.in);
       String answer;
        do {
            System.out.println("Do you understand loops?");
            answer = scan.nextLine();
        }while(answer.equalsIgnoreCase("No"));
    }
}