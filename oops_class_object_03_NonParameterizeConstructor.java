
class Student {
    String name;
    int age;

    public void info() {
        System.out.println(this.name);
        System.err.println(this.age);

    }

    // Student(String name, int age) {  // Parameterize Constructure
    //     this.name = name;
    //     this.age = age;
    // }

    Student(){
        System.out.println("Constructor Calling"); // non parameterize constructure
    }

}

public class oops_class_object_03_NonParameterizeConstructor {
    public static void main(String[] args) {
        Student detail = new Student();
        detail.name = "Rajan";
        detail.age = 25;
        

        detail.info();
    }
}
