interface Showable
{
    interface Message
    {
        void msg();
    }
    void show();
}
class Nested implements Showable,Showable.Message
{
    public void msg()
    {
        System.out.println("Inner Interface");
    }
    public void show()
    {
        System.out.println("Outer Interface");
    }
    public static void main(String args[])
    {
        Nested obj=new Nested();
        obj.msg();
        obj.show();
    }
}
Output:
Inner Interface
Outer Interface
