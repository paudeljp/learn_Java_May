class StudentInfo {
    String name;
    int age;
    String address;

    // Method to print only the name
    public void printInfo(String name) {
        System.out.println("Name: " + name);
    }

    // Method to print only the age
    public void printInfo(int age) {
        System.out.println("Age: " + age);
    }

    // Method to print both name and age
    public void printInfo(String name, int age) {
        System.out.println("Name: " + name + " Age: " + age);
    }

    // Method to print name, age, and address
    public void printInfo(String name, int age, String address) {
        System.out.println("Name: " + name + " Age: " + age + " Address: " + address);
    }
}

public class oops_polymorphism_01 {
    public static void main(String[] args) {
        StudentInfo std = new StudentInfo();
        std.name = "Rajan";
        std.age = 25;
        std.address = "Kathmandu";

        // Compile-time polymorphism: Method overloading
        std.printInfo(std.name);
        std.printInfo(std.age);
        std.printInfo(std.name, std.age);
        std.printInfo(std.name, std.age, std.address);
    }
}
