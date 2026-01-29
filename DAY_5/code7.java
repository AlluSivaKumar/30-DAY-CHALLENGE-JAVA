package DAY_5;

abstract class Animals
{
    abstract void sound();
}

class Cat extends Animals
{
    void sound()
    {
        System.out.println("MEOW");
    }
}

public class code7 {
    public static void main(String[] args) {
        Animals cats = new Cat();
        cats.sound();
    }
}
