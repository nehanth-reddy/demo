import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Student implements Comparable<Student>
{
    int age;
    String name;

    
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int compareTo(Student that) {
        return 0;
    }

    

}





public class Demo {
    public static void main(String[] args) throws InterruptedException
    {

        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student i, Student j)
            {
                if(i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };
       List<Student> studs = new ArrayList<>();
       studs.add(new Student(25, "nick"));
       studs.add(new Student(65, "nehanth"));
       studs.add(new Student(13, "alex"));
       studs.add(new Student(14, "tom"));

       Collections.sort(studs);
       for(Student s : studs)
       {
        System.out.println(s);
       }
    }
    
}
   