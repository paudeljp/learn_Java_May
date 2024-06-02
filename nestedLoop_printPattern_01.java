public class nestedLoop_printPattern_01 {
    public static void main(String[] args){
        char i;
        char j;
        for(i=1 ; i<=5 ; i++){ // Outer loop
            for(j=1; j<=6;j++){ // Inner loop
            System.out.print("*");
        }
        System.out.println();
        }
    }
}
