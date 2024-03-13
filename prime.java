public class prime {
    
    public static void main(String []args)
    {
        int x=6, cnt=0;
        
        for(int i=1; i<=10; i++)
        {
            if(x % i == 0)
            {
                cnt ++;
            }
        }

        if (cnt == 2) {
            System.out.println("Prime ");
        } else {
            System.out.println("Not Prime ");
        }
    }
}
