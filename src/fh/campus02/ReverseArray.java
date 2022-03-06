package fh.campus02;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] original = new int[] {1, 2, 3, 4};
        System.out.println("Original order: " + Arrays.toString(original));
        int[] newlyOrdered = reverse(original);
        System.out.println("New order: " + Arrays.toString(newlyOrdered));
    }
    public static int[] reverse(int[] original) {
        // make new array in which to store the values of the original array in the order we want
        int[] newOrderArray = new int[original.length];
        // in this loop we are actually counting down
        // so we start from the length of the array - 1
        // we need -1 here because arrays start counting from 0
        // we are then going up until including 0 (array[0] is the first position, so we need to include 0)
        // and then we count down instead of up 1--
        for (int i = original.length - 1; i >= 0; i--){
            // then we go through i for i
            // and we assign the first position of our new array the value that is in the last position of our old array
            // then in the next round we assign the second position of the new array the value of the penultimate position of the old array
            // and so forth until we reach the last position of the new array (original.length - 1 - 0)
            newOrderArray[original.length - 1 - i] = original[i];
        }
        return newOrderArray;
    }
}
