import java.lang.*;
class sup
{
	void robo()
	{
	System.out.println("hie");
	}
}
class sub extends sup
{
	void robo()
	{
	System.out.println("bye");
	}
}
class thunder
{
public static void main(String[]args)
{
	sub obj = new sub();
	obj.robo();
}
}
