package DAY_5;

/* An interface in Java is a blueprint of a class that contains only abstract methods (and constants). */

interface Vehicle
{
    abstract void engine();
    abstract void doors();
    abstract void horn();
}

class truck implements Vehicle
{

    @Override
    public void engine() {
        System.out.println("Hush Hush");
    }

    @Override
    public void doors() {
        System.out.println("2");
    }

    @Override
    public void horn() {
        System.out.println("Powee powee");
    }
    
}

public class code8 {
    public static void main(String[] args) {
        Vehicle trucks = new truck();
        trucks.engine();
        trucks.doors();
        trucks.horn();
    }
}
