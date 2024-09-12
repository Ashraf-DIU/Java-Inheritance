class math{
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
    int sum(int f, int e, String d){
        return 8;
    }
    math(){
        System.out.println("This Is Math Class");
    }
    math(int x){
        System.out.println("This is Math Class With Perameter X");
    }
}

public class mathod {
    public static void main(String[] args) {
        // Math m1 = new Math();
        // int res = m1.sum(5, 6);
        // System.out.println("result 1: "+res);
        // int res2 = m1.sum(2, 5 , 8);
        // System.out.println("Result 2: "+res2);

        math add = new math();
        math add2 = new math(5);
    }
}
