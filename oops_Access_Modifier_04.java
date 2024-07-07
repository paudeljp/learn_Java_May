class Person {
    public String name; // public access
    private int age; // private access
    protected String address; // protected access
    String phoneNumber; // default access

    // Constructor
    public Person(String name, int age, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    // Public method
    public void printPublicInfo() {
        System.out.println("Name: " + name);
    }

    // Private method
    private void printPrivateInfo() {
        System.out.println("Age: " + age);
    }

    // Protected method
    protected void printProtectedInfo() {
        System.out.println("Address: " + address);
    }

    // Default access method
    void printDefaultInfo() {
        System.out.println("Phone Number: " + phoneNumber);
    }

    // Public method to access private method
    public void showPrivateInfo() {
        printPrivateInfo();
    }
}

public class oops_Access_Modifier_04 {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 25, "Kathmandu", "9845632147");

        // Accessing public field
        System.out.println("Public field, Name: " + person.name);
        person.printPublicInfo();

        // Accessing private field (not directly accessible)
        // System.out.println("Access Private info, Age: " + person.age); // This will cause an error
        // person.printPrivateInfo(); // This will cause an error
        person.showPrivateInfo(); // Accessing Private method via public method

        // Accessing protected field
        System.out.println("Protected field, Address: " + person.address);
        person.printProtectedInfo();

        // Accessing default field
        System.out.println("Default field, Phone Number: " + person.phoneNumber);
        person.printDefaultInfo();
    }
}