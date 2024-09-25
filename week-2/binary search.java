import java.util.*;
class search{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of the array");
    int[] arr=new int[sc.nextInt()];
    System.out.println("enter the array elements");
    for(int i=0;i<arr.length;i++)
    {
    arr[i]=sc.nextInt();
    } 
    System.out.println("enter the key");
    int key=sc.nextInt();
    int start=0;
    int end=arr.length-1;
    boolean found=false;
      while(start<=end)
      {
       int mid=(start+end)/2;
       if(key==arr[mid]){
       System.out.println("if key is found:"+"["+mid+"]");
       found=true;
       break;
       }
      else if (key>arr[mid])
      {
       start=end+1;
       }
       else if(key<=arr[mid])
       {
       end=start-1;
       }
       }
       if(!found)
       {
       System.out.println("key is not found");
       }
       }
       }
    
    
