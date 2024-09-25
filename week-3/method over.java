import java.util.*;
class method{
       int add(int a, int b, int c)
       {
       return a+b+c;
       }
       int add(int a, int b)
       {
       return a+b;
       }
 public static void main(String[]args){
 method obj= new method();
 int result =obj.add(5,10);
 System.out.println(result);
 int result2 =obj.add(5,10,20);
 System.out.println(result2);
 }
 }
