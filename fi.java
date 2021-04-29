class A
{
    int k=10;
}

class B extends A{

    int k=20;

public static void main(String args[]){
    A a=new B();

    System.out.print(a.k);
}
}