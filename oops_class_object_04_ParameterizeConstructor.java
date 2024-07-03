class Student1 {
    String name;
    int age;

    public void info() {
        System.out.println(this.name);
        System.err.println(this.age);

    }

    Student1(String name, int age) {  // Parameterize Constructure
        this.name = name;
        this.age = age;
    }  
}

public class oops_class_object_04_ParameterizeConstructor {
    public static void main(String[] args) {
        Student1 detail = new Student1("Rajan", 25);
        detail.info();
    }
}
