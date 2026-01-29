package DAY_5;

class Students
{
    //Wrapping functions and classess in a single unit class.
    private int marks;

    public void setMarks(int marks)
    {
        this.marks = marks;
    }

    public int getMarks()
    {
        return marks;
    }
}

class code6 
{
    public static void main(String[] args) {
        Students siva = new Students();
        siva.setMarks(56);
        System.out.println(siva.getMarks());
    }
}

