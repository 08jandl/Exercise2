package fh.campus02;

public class Triangle {

    public static void main(String[] args) {
        // we write a loop that runs 10 times
        for (int i = 0; i <= 9; i++) {
            // in that loop we write another loop that prints the numbers for us
            // how often this second loop runs depends on which run we are on in the first loop
            // if we are in the first run, i = 0
            // so this second loop prints "0" + a space
            // the second time the i-loop runs, i = 1
            // so the j-loop runs twice, once for 0 (because j <= i  then means 0 <=1)
            // and prints 0 + space
            // then the j-loop runs a second time (1 <= 1)
            // and in the same line (.print - not println) prints 1 + space
            // and so...
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            // we need this one every time the i-loop finishes
            // this way we start the next i-loop in a new line
            System.out.println();
        }
    }
}
