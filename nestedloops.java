package review4;

public class nestedloops {
    public static void main(String[] args) {
// nested loop is loop inside another loop
// inner loop
        for (int i = 1; i <=3; i++) {
            System.out.println(i);
            // outer loop
            for (int j = 1; j <=4 ; j++) {
                System.out.println(j);
            }

        }System.out.println("=----------");


        for (int i = 1; i <5; i++) {//от этошо for зависит второй for
            System.out.println("Hi");
            for (int j = 1; j <=2 ; j++) {
                System.out.println("Bye");
            }
        }

    }
}
