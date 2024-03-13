public class sum_of_digit {
    
    public static void main(String[] args) {
        
        int x=153, ans=0, y;

        while(x > 0)
        {
            y = x % 10;
            ans = ans + y;
            x = x / 10;
        }

        System.out.println(ans);
    }
}
