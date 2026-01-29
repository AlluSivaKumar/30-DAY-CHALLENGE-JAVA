package DAY_5;
class student
{
    /* INSTANCE VARIABLES */
    String name;
    int rollno;
    int marks;

    public void display()
    {
        System.out.println(name + " " + rollno+ " " + marks);
    }
}
public class code1 
{
    public static void main(String[] args) 
    {
        student s1 = new student();
        s1.name = "Siva Kumar allu";
        s1.rollno = 142;
        s1.marks = 89;

        s1.display();
    }
}
