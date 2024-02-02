public class ArrayBinarySearch {

    public static int BinarySearch(int number[], int value) {

        int start = 0, end = number.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;
            // comparing

            if (number[mid] == value) {
                return mid;
            }

            if (number[mid] < value) {

                start = mid + 1;

            } else {
                end = mid - 1;
            }

        }
        return -1;

    }

    public static void main(String[] args) {

        int Numbers[] = { 2, 4, 6, 8, 10, 12 };
        int value = 10;

        System.out.println("index of given value is" + BinarySearch(Numbers, value));
    }

}
