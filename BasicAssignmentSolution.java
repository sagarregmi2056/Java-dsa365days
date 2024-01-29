import java.util.Scanner;
// find the average sum of three number

public class BasicAssignmentSolution {

    public static void main(String[] args) {

        Scanner Scannerobj = new Scanner(System.in);

        System.out.println("enter a first number");

        int firstnum = Scannerobj.nextInt();

        System.out.println("enter a second number");
        int secondnum = Scannerobj.nextInt();

        System.out.println("enter a third  number ");

        int thirdnum = Scannerobj.nextInt();

        int sum = 0;

        sum = (firstnum + secondnum + thirdnum) / 3;

        System.out.println("the sum of those number is" + sum);
    }

}
