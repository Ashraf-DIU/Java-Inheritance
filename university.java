public class university {
    public static void main(String[] args) {
        Daffodil diu = new Daffodil();
        Department dept = new Department();
        dept.display();
    }
}

class Daffodil{
    void display(){
        System.out.println("Daffodil International University");
    }
}

class Department extends Daffodil{
    void display(){
        System.out.println("CSE");
    }
}