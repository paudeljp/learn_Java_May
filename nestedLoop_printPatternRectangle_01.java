public class nestedLoop_printPatternRectangle_01 {
    public static void main(String[] args){
        char i;
        char j;
        for(i=1 ; i<=5 ; i++){ // Rows-Outer loop
            for(j=1; j<=6;j++){ // Column-Inner loop
            System.out.print("*");
        }
        System.out.println();
        }
    }
}

//Output
/* 
 ******
 ******
 ******
 ******
 ******
*/
