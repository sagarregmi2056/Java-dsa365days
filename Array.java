import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        // creation of array datatype variable[] = new datatype[number of array];

        int marks[] = new int[50];

        Scanner scannerObj = new Scanner(System.in);

        System.out.println("enter marks of first subject of index 0");

        marks[0] = scannerObj.nextInt();
        System.out.println("enter marks of second subject of index 1");

        marks[1] = scannerObj.nextInt();
        System.out.println("enter marks of third subject of index 2");

        marks[2] = scannerObj.nextInt();

        System.out.println("enter marks of fourth subject of index 3");

        marks[3] = scannerObj.nextInt();

        System.out.println("first subject marks:" + marks[0]);
        System.out.println("first subject marks:" + marks[1]);
        System.out.println("first subject marks:" + marks[2]);
        System.out.println("first subject marks:" + marks[3]);

    }

}

// *******************************output**********************************************
// enter marks of first subject of index 0
// 40
// enter marks of second subject of index 1
// 60
// enter marks of third subject of index 2
// 70
// enter marks of fourth subject of index 3
// 80
// first subject marks:40
// first subject marks:60
// first subject marks:70
// first subject marks:80