class A{
    void msgA(){
        System.out.println("This is class A");
    }
}

class B extends A{
    void msgB(){
        System.out.println("This is class B");
    }
}
class C extends B{
    void msgC(){
        System.out.println("This is class C");
    }
}

public class MyInheri {
    public static void main(String[] args) {
        C c1 = new C();
        c1.msgC();
        c1.msgA();
    }
}
