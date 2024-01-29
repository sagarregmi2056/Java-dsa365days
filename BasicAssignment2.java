import java.util.Scanner;

public class BasicAssignment2 {
    // finding area of square
    public static void main(String[] args) {
        Scanner ScannerObj = new Scanner(System.in);

        System.out.println("Enter a side of square");

        int side = ScannerObj.nextInt();

        int area = 0;

        area = (side * side);

        System.out.println("area of the given square is:" + area);

    }
}
