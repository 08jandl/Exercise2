package fh.campus02;

public class PerfectNumber {
    public static void main(String[] args) {
        // do the calculation for the numbers between 1 and 100 000 000
        for (int i = 1; i <= 100000000; i++) {
            if (isPerfectNumber(i)) {
                System.out.println(i + " is a perfect number!");
            }
        }
    }

    // create a method that finds a perfect number
    public static boolean isPerfectNumber(int number) {
        // if the number (i of the loop) is a perfect number return true
        // int sum = getSumOfRealDivisors(number)
        if (number == getSumOfRealDivisors(number)) {
            return true;
        } else {
            return false;
        }
    }

    public static int getSumOfRealDivisors(int number) {
        int sum = 0;
        // a perfect number is a number that is half the sum of all of its positive divisors including itself;
        // in our loop we try to find the sum of all real divisors
        // we can stop at half the number (i/2) because adding the sum of all the divisors we get here will then give us the number
        // if it is perfect that is the same number that we ask about in the main method (or the ont the loop in the main method is currently asking about)
        // so, either we only look for divisors up to half of the number, or we need to multiply our number by 2 when we check it in isPerfectNumber()
        // because of math:
        // σ1(n) = 2n where σ1 is the sum-of-divisors function. For instance, 28 is perfect as 1 + 2 + 4 + 7 + 14 + 28 = 56 = 2 × 28
        for (int i = 1; i <= number/2; i++) {
            // finding the true divisors,
            // checking every i to see if is a true divisor of number
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
