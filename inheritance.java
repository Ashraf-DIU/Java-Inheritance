import javax.print.DocFlavor.STRING;

class Person {
    String name;
    String id;
    String mail;

    void insert_record(String name, String id, String mail){
        this.name = name;
        this.id = id;
        this.mail = mail;
    }
}

class Student extends Person{
    Double cgpa;

}

class MyInheritance{
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.insert_record("Touhid", "38265", "example@gmail.com");
        Student stu1 = new Student();
        stu1.insert_record("Touhid", "38265", "example@gmail.com");

        System.out.println(person1.name);
        System.out.println(stu1.mail);
    }
}