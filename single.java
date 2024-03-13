class A {

    int x;

    void show()
    {
        x=10;
        System.out.println(x);
    }
}
public class single extends A{
    
    void disp()
    {
        x=20;
        System.out.println(x);
    }
    public static void main(String[] args) {

        single obj = new single();

        obj.show();
        obj.disp();
    }
}
