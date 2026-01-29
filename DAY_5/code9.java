package DAY_5;

class Siva
{
    String surname;

    public void setSurname(String surname)
    {
        this.surname = surname;
    }
}
public class code9 {
    public static void main(String[] args) {
        /* THIS KEYWORD REFERS TO THE CURRENT OBJECT INSIDE THE CLASS */
        Siva siva = new Siva();
        siva.setSurname("Allu");
        System.out.println(siva.surname);
    }
}
