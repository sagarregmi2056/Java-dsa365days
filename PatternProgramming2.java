
// question 
// 01234 = j
// ***** i=0
// *   *  1
// *****  2
// *   *  3
// *****  4

public class PatternProgramming2 {

    public static void main(String[] args) {
        int N = 5;

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {

                if (i == 0 || i == 2 || i == N - 1 || j == 0 || j == N - 1) {
                    System.out.print("*");
                } else
                    System.out.print(" ");

            }

            System.out.println();

        }

    }

}

// output

// *****
// * *
// *****
// * *
// *****
