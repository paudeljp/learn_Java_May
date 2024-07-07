class Account{
    // private fields (data hiding)
    private String accountNumber;
    private double balance;
    // These fields are marked private to restrict direct access from outside the Account class. 
    // This is the essence of data hiding. Only methods within the Account class can access these fields directly.

    public Account(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    // This constructor initializes the fields accountNumber and balance when an Account object is created.

    // public getter for accountNumber
    public String getAccountNumber(){
        return accountNumber;
    }
    // These methods provide read-only access to the accountNumber and balance fields.
    // By using these methods, we can ensure that the internal state of the object is not modified from outside.

    // public getter for balance

    public double getBalance(){
        return balance;
    }

    // public setter for balance

    public void setBalance( double balance){
        if(balance >= 0){
            this.balance = balance;
        } else {
            System.out.println("Invalid balance amount");
        }
    }
    // This method increases the balance by the specified amount, provided the amount is positive.
    // It encapsulates the logic for depositing money into the account, ensuring the balance cannot be increased by an invalid amount.

    // Public method to deposit money
    public void deposit(double amount){
        if(amount > 0){
            balance = balance+amount;
        }else{
            System.out.println("Invalid deposit amount");
        }
    }
    // public method to withdrow money

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance){
            balance = balance - amount;
        }else{
            System.out.println("Invalid or insufficient funds for withdrawal");
        }
    }
    // This method decreases the balance by the specified amount, provided the amount is positive and does not exceed the current balance.
    // It ensures that withdrawals are valid and funds are sufficient.
}


public class oops_Data_Hiding_05 {
    public static void main(String[] args) {
        Account account = new Account("123456789",500.0);

        // Access and modify account data trough public methods
        System.out.println("Account Number: "+account.getAccountNumber());
        System.out.println("Initial Balance: "+account.getBalance());

        // Deposit money
        account.deposit(200.0);
        System.out.println("Balance after deposit: "+account.getBalance());

        // Withdraw money
        account.withdraw(150.0);
        System.out.println("Balance after withdrawal: "+ account.getBalance());

        // Attempt to set a negative balance (should be prevented by setter)
        account.setBalance(-100.0);
        System.out.println("Balance after attempting to set a negative balance: "+ account.getBalance());
    }
}

/**
 * # Data Hiding: Achieved by making the fields private. Direct access to these fields is not possible from outside the class.
   # Encapsulation: By providing public getter and setter methods, along with methods to deposit and withdraw money, 
       we encapsulate the internal state of the Account object and provide controlled access to it.
   # Validation: The setBalance, deposit, and withdraw methods include validation to ensure that the internal state remains consistent and valid.
 */