
// scaler pattern programming 

// j 
//o 1 2 3
// **** i=0
// *  * i =1
// *  * i = 2
// **** i =3

// print start in only case of i=0 or 3 or if j = 0 or 3 else white space

public class PatternProgramming {

    public static void main(String[] args) {

        int N = 4;

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {

                if (i == 0 || i == 3 || j == 0 || j == 3) {

                    System.out.print("*");

                }

                else
                    System.out.print(" ");

            }

            System.out.println();

        }

    }

}

// output
// ****
// * *
// * *
// ****