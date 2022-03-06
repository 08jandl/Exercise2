package fh.campus02;

public class SumTotal {

    public static void main(String[] args) {
        // we start with making space for the result of our sum, initializing with 0
        int sum = 0;

        //our for loop should run between the numbers 1 & 100
        for (int i = 1; i <= 100; i++) {
            // every time the loop comes by, it adds the value of i to the loop, the first time it add 0 + 1;
            // the second time it adds 1 + 2
            // the third time it adds 3 + 3 etc...
            sum += i;
        }
        System.out.println(sum);
    }
}
