public class ArrayLargestNUmber {

    public static int SearchingLargestNumber(int Numbers[]) {
        // largest number ma la sab vanda sano value halyou like 0
        int LargestNumber = Integer.MIN_VALUE;

        // checking all the numbers one by one
        for (int i = 0; i < Numbers.length; i++) {

            // here 0<number o index ko value vanya large number 0 index ko value lai banau

            if (LargestNumber < Numbers[i]) {

                LargestNumber = Numbers[i];

            }
            // comparing number with first number

        }
        return LargestNumber;

    }

    public static void main(String[] args) {

        // let array contain 9 11 8 18

        int Numbers[] = { 9, 11, 8, 18 };

        int FinalLargest = SearchingLargestNumber(Numbers);

        System.out.println("the final largest number is " + FinalLargest);

        // int LargestNumber=0 ;

    }

}
