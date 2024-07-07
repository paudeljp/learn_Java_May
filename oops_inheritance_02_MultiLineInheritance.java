class Person {
    String name = "Rajan";
    int age = 25;

    public void printInfo() {
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
    }
}

class Student11 extends Person {
    int studentID = 555;
    String course = "Science";

    public void printInfo() {
        super.printInfo();
        System.out.println("Student ID is: "+studentID);
        System.out.println("Course is: "+course);
    }
}

class LibraryMember extends Student11 {
    String memberID = "ABCD";
    String bookedIssued = "01-05-2024";

    public void printInfo() {
        super.printInfo();
        System.out.println("Member ID is: "+memberID);
        System.out.println("Booked Issued date is: "+bookedIssued);
    }
}

public class oops_inheritance_02_MultiLineInheritance {

    public static void main(String[] args) {
        LibraryMember sc = new LibraryMember();
        sc.printInfo();
    }
}
