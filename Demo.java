import java.util.Collection;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) throws InterruptedException
    {
       Collection<Integer> nums = new TreeSet<Integer>();
       nums.add(62); 
       nums.add(54);
       nums.add(82);
       nums.add(21);



       for(int n : nums)
       {
            System.out.println(n);
       }
    }
    
}
   