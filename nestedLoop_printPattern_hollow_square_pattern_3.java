
// 1. Print a right-angled triangle pattern using asterisks (*) with a fixed number of rows (e.g., 5 rows)

/* public class nestedLoop_printPattern_right_angled_Triangle_1 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

}*/

// 2. Print a square pattern using asterisks (*) with a fixed size (e.g., 4x4). 
/* public class nestedLoop_printPattern_square_pattern_2 {
    public static void main(String[] args) {
        int m = 4;
        int n = 4;
        for(int i = 1; i<=m; i++){
            for(int j = 1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        
    }

}*/

//3.Print a hollow square pattern using asterisks (*) with a fixed size (e.g., 5x5)
public class nestedLoop_printPattern_hollow_square_pattern_3 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

    }

}
