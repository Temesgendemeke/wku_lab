package inheritance_class;

public class B extends A{
int k;

private  B(int a, int b, int c){
    super(a, b);
    this.k =c;
}
public void showk()
{
System.out.println("the value of k is "+this.k);
}
public void showIandJandK(){
    System.out.println(" i"+this.i+", j "+this.j+", k"+this.k);
}

public static void main(String[] args) {
    A superclass = new A(10,20);
    superclass.i=10;
    superclass.j=20;
    superclass.showiandj();

    B subclass = new B(50,100,200);
    subclass.showiandj();
    System.out.println("____________");
    subclass.showk();
    System.out.println("_____________");
    subclass.showIandJandK();
}
}