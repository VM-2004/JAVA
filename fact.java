public class fact {

    public static void main(String []args)
    {
        int f=1, x;

        for(x=1; x<=5; x++)
        {
            f = f * x;
        }

        System.out.println("factorial is - " + f);
    }
}