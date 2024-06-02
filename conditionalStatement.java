// check if the person is adult or not. if age > 18 -->adult else not adult

import java.util.*;

public class conditionalStatement {
    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int age = sc.nextInt();
        sc.close();
        if(age > 18){
            System.out.print("you are Adult");
        }
        else{
            System.out.print("you are not adult");
        }
    }
}
