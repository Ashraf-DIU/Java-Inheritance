public class university {
    public static void main(String[] args) {
        Daffodil diu = new Department();
        diu.display();
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