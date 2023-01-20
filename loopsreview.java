package review4;

public class loopsreview {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            System.out.print(i + " ");
        }

        System.out.println("----------");
        // for loop used when we know how many times we want repeat the code

        for (int j = 2; j < 20; j += 5) {
            System.out.println(j);
            if (j == 12) {
                System.out.println("asa i equal to 12-im breaking my loop");
                break;
            }

        }//break and continue





    }

}
