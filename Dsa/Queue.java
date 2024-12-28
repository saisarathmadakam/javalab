// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
      
    public static void main(String[] args) {
        Main ss = new Main();
        ss.enqueue(9);
        ss.enqueue(8);
        ss.enqueue(7);
        ss.dequeue();
        ss.dequeue();
        
        ss.print();
    }
    Scanner sc = new Scanner(System.in);
    int n;
    int[] queue=new int[5];
    int front=-1;
    int rear=-1;
    public void enqueue(int data)
    {
        if(rear==5-1)
    {
        System.out.println("queue is overflow");
    }
    else if(front==-1&&rear==-1)
    {
        front=rear=0;
        queue[rear]=data;
    }
    else
    {
        rear++;
        queue[rear]=data;
    }
}
 public void print()
{
    int i;
    if(front==-1&&rear==-1)
    {
        System.out.println("list is empty");
    }
    else
    {
        for(i=front; i<rear+1; i++)
        {
            System.out.println(queue[i]+ " ");
        }
    }

}
public void dequeue()
{
     if(front==-1&&rear==-1)
    {
         System.out.print("list is underflow");
    }
    else if(front==rear)
    {
        front=rear=-1;
    }
    else
    {
        System.out.println("dequeue:"+queue[front]);
        
        front++;
    }
}

}
