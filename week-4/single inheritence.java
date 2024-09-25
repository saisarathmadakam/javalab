import java.util.*;
class one
{   int x;
    void getx()
    {
        x=100;
        System.out.println("x value is:"+x);
    }
}
class two extends one
{
    int y,total;
    void gety()
    {
        y=200;
         System.out.println("y value is:"+y);
        
    }
    void sum()
    {
        total=x+y;
         System.out.println(total);
    }
}
public class si{

    public static void main(String[]args)
    {
        two obj =new two();
        obj.getx();
        obj.gety();
        obj.sum();
    }
}
