class A{
    void a(){
        System.out.println("A");
    }
}
class B extends A{
    void b(){
        System.out.println("B");
    }
}
class C extends B{
    void c(){
        System.out.println("C");
    }
}
public class multilevel extends C{
    
    public static void main(String[] args) {

        multilevel obj = new multilevel();
        obj.a();
        // obj.b();
        // obj.c();
    }
    
}
