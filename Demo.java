import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) 
    {
        List<Integer> nums = Arrays.asList(4,5,6,7,8);
        Stream<Integer> s1 = nums.stream();
        s1.forEach(n -> System.out.println(n));

        
    }
    
}
   