package Unit1;
interface Ix{
 public void myMethod();
}
interface Iy{
 public void myMethod1();
}
class Multiple implements Ix,Iy {
public void myMethod(){
    System.out.println("Implementing more than one inhertance");
}
public void myMethod1(){
    System.out.println("Implementing more than one inhertanc1");
}

 public static void main(String[] args) {
    Multiple obj =  new Multiple();
    obj.myMethod();
    obj.myMethod1();
 }
}