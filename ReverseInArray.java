public class ReverseInArray {

    public static void reverse(int Numbers[]) {
        int first = 0, last = Numbers.length - 1;

        while (first < last) {
            int temp = Numbers[last];
            Numbers[last] = Numbers[first];
            Numbers[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {

        int Numbers[] = { 2, 4, 6, 8 };
        reverse(Numbers);

        for (int i = 0; i < Numbers.length; i++) {
            System.out.println(Numbers[i] + "");

        }
        System.out.println();

    }
}
