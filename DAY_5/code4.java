package DAY_5;

class Animal
{
    String call;
    public void sound()
    {
        /* this.call = "mewow"; */
        System.out.println("Meow");
    }
}
class Dog extends Animal
{
    @Override
    public void sound()
    {
        //super.sound();
        /* this.call = "bark"; */
        System.out.println("Bark");
    }
}

public class code4 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();

        Animal dog = new Dog();
        dog.sound();
    }
}
