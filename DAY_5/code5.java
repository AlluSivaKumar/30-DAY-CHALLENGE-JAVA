package DAY_5;

class Calc
{
    public int add(int a, int b)
    {
        return a+b;
    }
    public int add(int a, int b, int c)
    {
        return a+b+c;
    }
}
class AdvCalc extends Calc
{
    @Override
    public int add(int a,int b)
    {
        return super.add(a, b);
        /* System.out.println("adding plus 10");
        return a + b + 10; */
    }
}

public class code5 {
    public static void main(String[] args) {
        Calc calculator = new Calc();
        System.out.println(calculator.add(4, 6));

        Calc calculator1 = new AdvCalc();
        System.out.println(calculator1.add(4, 6));
    }
}
