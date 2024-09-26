import java.util.*;
public class program1
{
   public static void main(String[]args)
   {
       int a=10;
       int b=0;
       int result = 0;
     
      try
      {
          result=a/b;
      }
     
      catch(ArithmeticException ae)
      {
          System.out.println(ae.toString());
       
      }
      
      
      finally
      {
           System.out.println("sarath");
      }
       
       System.out.println("result is :"+result);
       System.out.println("excution  is done");
   }
}
