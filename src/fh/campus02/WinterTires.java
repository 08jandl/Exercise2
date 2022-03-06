package fh.campus02;

public class WinterTires {
    public static void main(String[] args) {

        // should return true because temperature is lower than 4
        if (needWinterTires(1, false)) {
            System.out.println("Please use winter tires");
        } else {
            System.out.println("Winter tires are not required");
        }

        // should return false because the temperature is above 10
        if (needWinterTires(12, true)) {
            System.out.println("Please use winter tires");
        } else {
            System.out.println("Winter tires are not required");
        }

        // should return false because the road is not slippery
        if (needWinterTires(5, false)) {
            System.out.println("Please use winter tires");
        } else {
            System.out.println("Winter tires are not required");
        }

        // should return true because the road is slippery
        if (needWinterTires(5, true)) {
            System.out.println("Please use winter tires");
        } else {
            System.out.println("Winter tires are not required");
        }

    }

    public static boolean needWinterTires(int temperature, boolean slipperyRoad) {
        if (temperature < 4 || temperature < 10 && slipperyRoad) {
            return true;
        } else {
            return false;
        }
    }
}
