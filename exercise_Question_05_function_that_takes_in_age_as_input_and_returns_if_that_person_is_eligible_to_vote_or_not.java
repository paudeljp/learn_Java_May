import java.util.Scanner;
public class exercise_Question_05_function_that_takes_in_age_as_input_and_returns_if_that_person_is_eligible_to_vote_or_not{
    public static void checkAge(int age) {
        if(age >= 18){
            System.out.println("you are eligible");
        }
        else{
            System.out.println("You are not eligible");
        }
    }
    public static void main(String[] args) {
        String reCheck;
        Scanner sc = new Scanner(System.in);
        // Validate invalid entry
        do{
        System.out.print("Enter your age: ");
        while(!sc.hasNextInt()){
            System.out.println("Invalid input, Please enter a valid number");
            sc.next();
            System.out.print("Enter your age: ");
        }
        int age = sc.nextInt();
        reCheck = sc.nextLine();
        checkAge(age);
        System.out.print("Do you want to continue? type y and enter: ");
        reCheck = sc.nextLine();
        }
        while(reCheck.equalsIgnoreCase("y"));
        {
            System.out.print("invalid entry");
            sc.close();           
        }
    }
}