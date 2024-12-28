class Main {
    public static void main(String[] args) {
        Main ss= new Main();
        ss.push(7);
        ss.push(5);
        ss.push(8);
        ss.pop();
        ss.show();
        System.out.println("peek"+"  "+ ss.peek());
    }
    int[]stack = new int[5];
    int top=0;
    public void push(int data)
    {
         if(top<stack.length)
         {     stack[top]=data;
               top++;
               
         }
         
         else
          {
               System.out.println("stack is full");
          }
    }
    public void show(){
         for(int i=0;i<top;i++)
        
  {
             System.out.println(stack[i]+" ");
             
         }
    }
    public int pop()
    {  int data;
         if(top>0)
         {
              top--;
              data=stack[top];
              stack[top]=0;
              return data;
         }
         else{
              System.out.println("stack is empty");
              return -1;
         }
    }
     public int peek()
   {
       int data;
       data=stack[top-1];
       return data;
       
   }

}
