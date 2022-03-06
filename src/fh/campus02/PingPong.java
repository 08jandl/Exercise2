package fh.campus02;

public class PingPong {

    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 100) {
            System.out.print(counter);
            if (counter % 6 == 0) {
                System.out.println(" ping pong");
            } else if (counter % 3 == 0) {
                System.out.println(" pong");
            } else if (counter % 2 == 0) {
                System.out.println(" ping");
            } else {
                System.out.println("-");
            }
            counter++;
        }

        System.out.println("------------------------------------");

        // same but with for loop:
        for (int i = 1; i <= 100; i++) {
            System.out.print(i);
            if (i % 6 == 0) {
                System.out.println(" ping pong");
            } else if (i % 3 == 0) {
                System.out.println(" pong");
            } else if (i % 2 == 0){
                System.out.println(" ping");
            } else {
                System.out.println("-");
            }
        }
    }
}
