class HelloWorld {
    public static void main(String[] args) {
        try 
        {
            int arr[] = new int[5];
            arr[6]=10;
            
            int result = 10/0;
            
            System.out.println("result:"+result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticExpection:cannot divided by zero");
        }
        catch(ArrayIndexOutOfBoundsException ae)
        {
            System.out.println("ArrayIndexOutOfBounsExpection:cannot divided by zero");
        }
        catch(Exception e)
        {
            System.out.println("general expection:"+e.getMessage());
        }
}
}
