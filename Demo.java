import java.util.HashMap;
import java.util.Map;
public class Demo {
    public static void main(String[] args) throws InterruptedException
    {
       Map<String, Integer> students = new HashMap<>();

       students.put("Navin", 56);
       students.put("Harsh", 23);
       students.put("Sushil", 67);
       students.put("Kiran", 92);
       
       System.out.println(students.get("Harsh"));
    }
    
}
   