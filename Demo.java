import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) 
    {
        List<Integer> nums = Arrays.asList(4,5,6,7,8);

        int sum = 0;
        for(int n : nums)
        {
            if(n%2==0)
            {
                n = n*2;
                sum = sum + n;
            }
        }

        System.out.println(sum);
    }
    
}
   