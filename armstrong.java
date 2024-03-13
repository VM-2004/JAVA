public class armstrong {

    public static void main(String[] args) {
        
        int x=153, ans=0, y, temp;

        temp = x;

        while(x!= 0)
        {
            y = x % 10;
            ans = ans + (y*y*y);
            x = x / 10;
        }

        if(temp == ans)
        {
            System.out.println("Armstrong ");
        }
        else
        {
            System.out.println("Not Armstrong ");
        }

    }
}
