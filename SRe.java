package review3;

import java.util.Scanner;

public class SRe {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your favorite browser");
        String browser=input.nextLine();

        switch (browser){
            case "chrome":
                System.out.println("this the one");
                break;
            case "safari":
                System.out.println("this is the one");
                break;
            case "mozilla":
                System.out.println("this is the one");
                break;
            default:
                System.out.println("None of this");
        }

    }
}
