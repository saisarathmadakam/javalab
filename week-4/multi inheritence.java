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
}
class three extends two{
    

    void sum()
    {
        total=x+y;
         System.out.println(total);
    }
}
public class si{

    public static void main(String[]args)
    {
        three obj =new three();
        obj.getx();
        obj.gety();
        obj.sum();
    }
}
