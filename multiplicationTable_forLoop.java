//Prnt Multiplication table from the given number
import java.util.*;
public class multiplicationTable_forLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char choice;
        do{
        System.out.print("Enter any number to print table: ");
        int num = sc.nextInt();
        int result = 1;
        int i=1;
        for(i = 1; i <= 10 ; i++){
            result = num * i;
            System.out.println(num +" x "+ i + " = " + result);
        }
        System.out.print("Do you want to print again, (Y/y): ");
        choice = sc.next().charAt(0);

        } while(choice == 'y' || choice == 'Y');

    }
}
