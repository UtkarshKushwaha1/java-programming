//Inheritance ob.f1 ob.f2

class inheritance{

     void f1(){
        System.out.println("Base Class");
    }
    
}

class c2 extends inheritance
{

     void f2()
    {
        System.out.println("Inherited Class");
    }
}

class Test{

    public static void main(String args[]){

        c2 B = new c2();
        B.f1();
        B.f2();
    }
}

