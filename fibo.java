public class fibo {
    
    public static void main(String []args)
    {
        int x=0, y=1, z=0;

        System.out.println(x + "\n" + y);
        
        while(z <= 50)
        {
            z = x+y;
            System.out.println(z);
            x=y;
            y=z;
        }
    }
}
