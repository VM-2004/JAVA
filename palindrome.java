public class palindrome {
    
    public static void main(String args[])
    {
        int x=121, ans=0, y, temp;

        temp = x;

        while(x!= 0)
        {
            y = x % 10;
            ans = (ans * 10) + y;
            x = x / 10;
        }

        if(temp == ans)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
