package DAY_5;

class Demo 
{
    static 
    {
        System.out.println("Static block executed");
    }
    public static void show(){
        System.out.println("Siva Kumar Allu");
    }
}

public class code10 {
    public static void main(String[] args) {
        System.out.println("Main Method executed");
        //Demo demo = new Demo();
        /* here no object is created we can directly access static methods via class name. */
        Demo.show();
    }
}

