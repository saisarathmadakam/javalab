class sarathException extends Exception
{
    public sarathException(String message)
    {
        super(message);
    }
}
public class UserDefinedExecption{
    public static void main(String[]args)
    {
        try
        {
            validateAge(15);
        }
        catch(sarathException e)
        {
            System.out.println("caugth sarathExpection:"+e.getMessage());
        }
    }
    
    static void validateAge(int age) throws sarathException
    {
        if(age<18)
        {
            throw new sarathException("age is must be 18 above");
            
        }
        else
        {
            System.out.println("valid");
        }
    }
        
    
}
