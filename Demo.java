class A{
    public void show() throws ClassNotFoundException
    {
        Class.forName("Demo");
        
    }
}



public class Demo {
    public static void main(String[] args) {
       A obj = new A();
       try {
        obj.show();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    }
    
}
   