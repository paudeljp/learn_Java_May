class Employee {
    String name = "Rajan";
    int age = 25;
    double salary = 10000.95;

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    String department = "Admin";

    public void printDetails() {
        super.printDetails(); // Call superclass method to print basic info
        System.out.println("Department: " + department);
    }
}

class Worker extends Employee {
    String designation = "Developer";

    public void printDetails() {
        super.printDetails(); // Call superclass method to print basic info
        System.out.println("Designation: " + designation);
    }
}

public class oops_inheritance_03_HierarchicalInheritance {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.printDetails();

        System.out.println(); // Empty line for clarity

        Worker worker = new Worker();
        worker.printDetails();
    }
}
