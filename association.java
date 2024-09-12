import java.util.ArrayList;

class Student {
    String name;
    String id;
    String mail;

    void insert_record(String name, String id, String mail){
        this.name = name;
        this.id = id;
        this.mail = mail;
    }
}

class L_64{
    ArrayList<Student>sec_64 = new ArrayList<Student>();
    void add_student(Student student){
        sec_64.add(student);
    }

    void show_stuInfo(){
        for(Student student: sec_64){
            System.out.println("Name: "+student.name+ "  ID: " +student.id+ "  Email: " +student.mail);
        }
    }
}

public class association {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.insert_record("Ashraf Bin Alam", "923758327", "abc@gmail.com");
        // System.out.println(stu1.name);

        Student stu2 = new Student();
        stu2.insert_record("Mubarak Hossain", "927364767327", "efg@gmail.com");
        // System.out.println(stu2.name);

        Student stu50 = new Student();
        stu50.insert_record("Bokki Cokki", "94854767327", "efhdsg@gmail.com");
        L_64 sec = new L_64();
        sec.add_student(stu1);
        sec.add_student(stu2);
        sec.add_student(stu50);

        sec.show_stuInfo();
    }
}
