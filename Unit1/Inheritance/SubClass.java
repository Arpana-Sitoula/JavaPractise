package Unit1.Inheritance;

 class SuperClass {
    int n=100;
}
public class SubClass extends SuperClass{
    int n=50;
     public void printNum(){
        System.out.println(n);
    }
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.printNum();
        SuperClass obj1 = new SuperClass();
        int res = obj1.n;
        System.out.println(res);
    }
}
