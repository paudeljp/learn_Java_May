public class nestedLoop_printPatternHalfPiramid_03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }

}

// Output
/*
 *
 * *
 * * *
 * * * *
 */
