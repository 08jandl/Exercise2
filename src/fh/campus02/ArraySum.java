package fh.campus02;

public class ArraySum {
    public static void main(String[] args) {
//        Write a static public method with the following signature:
//        public static int calculateSum(int[] numbers) {...}
//        The method should calculate the sum of the elements in the array and return it.
        int[] numbers = new int[]{1, 2, 3, 4};
        System.out.println("The sum of all the numbers contained in the array is: " + calculateSum(numbers));
    }

    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }
}
