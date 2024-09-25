import java.util.*;
   
 class Qudratic{
       public static void main(String []args)
       {
           Scanner sc =new Scanner(System.in);
           double a,b,c,root1,root2,img,d;
           System.out.println("enter a");
           a = sc.nextDouble();
           System.out.println("enter b");
           b= sc.nextDouble();
           System.out.println("enter c");
           c= sc.nextDouble();
           d=b*b-4*a*c;
           if(d>0){
               root1= (-b+Math.sqrt(d))/(2*a);
               root2=(-b-Math.sqrt(d))/(2*a);
               System.out.println("root are and diffrent");
               System.out.printf("Root1 = %.2f\n", root1);
               System.out.printf("Root2 = %.2f\n", root2);
           }
           else if(d==0){
               root2=root1=-b/(2*a);
               System.out.println("the roots are real and same");
               System.out.printf("Root1 = Root2 = %.2f\n", root1);
           }
           else{
               root2=root1=-b/(2*a);
               img=Math.sqrt(-d)/(2*a);
               System.out.println("the roots are imaginary");
               System.out.printf("Root1 = %.2f + %.2fi\n", root1, img);
               System.out.printf("Root2 = %.2f - %.2fi\n", root1, img);
             
           }
           
       }
 }
