public class ArrayPassingASArgs {
    // getting array as args
    public static void updateByOne(int marks[]) {
        // yaha input lina lai forloop chalako
        for (int i = 0; i < marks.length; i++) {

            // incrementing value of array of index 0 1 and 2 by one
            marks[i] = ++marks[i];

        }

    }

    public static void main(String[] args) {
        // array declare
        int marks[] = { 92, 93, 94 };
        // passing array
        updateByOne(marks);

        // yaha output dekhauna lai for loop chalako
        for (int i = 0; i < marks.length; i++) {

            
            marks[i] = marks[i];
            System.out.println(marks[i]);
        }

    }

}
