package DAY_5;

public class code2 {
    public static void main(String[] args) {
        Student teja = new Student();
        System.out.println(teja.name);
    }
}


class Student
{
    String name;
    int rollNo;
    Student() 
    {
        this.name = "siva";
        this.rollNo = 142;
    }
    Student (String name , int rollNo) //Paramaterized Constructor
    {
        name = this.name;
        rollNo = this.rollNo;
    }
    
}

