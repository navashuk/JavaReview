package review3;

import java.util.Scanner;

public class whioleloooop {
    public static void main(String[] args) {
        int i=1;
        while (i<=4){
            System.out.println("hello");
           i++;
        }






        Scanner input=new Scanner(System.in);
        System.out.println("Are you tired?");
     boolean tired= input.nextBoolean();
     while (!tired){
         System.out.println("love programming");
       tired= input.nextBoolean();//boolean name
         System.out.println("gerat");
     }

    }
}
