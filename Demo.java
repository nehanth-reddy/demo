import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
public class Demo {
    public static void main(String[] args) throws InterruptedException
    {
       Map<String, Integer> students = new Hashtable<>();

       students.put("Navin", 56);
       students.put("Harsh", 23);
       students.put("Sushil", 67);
       students.put("Kiran", 92);
       students.put("Kiran", 93);

       System.out.println(students);

       for(String key : students.keySet())
       {
        System.out.println(key + " : " + students.get(key));
       }
    }
    
}
   