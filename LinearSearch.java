
public class LinearSearch {
    // taking number and value as args
    public static int searching(int Numbers[], int value) {

        for (int i = 0; i < Numbers.length; i++) {

            // if number index have that given value return the given index
            if (Numbers[i] == value) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        int Numbers[] = { 30, 40, 50, 60, 80 };

        // the value to find by searching lineraly
        int value = 80;

        // calling the given function using variable

        // passing number and value

        int ReturnedIndex = searching(Numbers, value);

        if (ReturnedIndex == -1) {
            System.out.println("The given value is not found");
        }

        else

            System.out.println("the key of the given given value is " + ReturnedIndex);

    }

}
