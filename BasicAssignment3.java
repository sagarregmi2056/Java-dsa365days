import java.util.Scanner;

public class BasicAssignment3 {
    public static void main(String[] args) {
        Scanner Scannerobj = new Scanner(System.in);

        System.out.println("enter a value of pencils");

        float pencil = Scannerobj.nextFloat();

        System.out.println("enter a value of pen");

        float pen = Scannerobj.nextFloat();

        System.out.println("enter the price of eraser");

        float eraser = Scannerobj.nextFloat();

        float total = 0;
        float aftertax;
        // before tax
        total = (pencil + pen + eraser);

        // after tax

        float tax = 18;

        aftertax = total + (total * 18) / 100;

        System.out.println("The total amount after tax: " + aftertax);

    }

}
