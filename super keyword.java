import java.lang.*;
class Animal
{
	Animal()
	{
	 System.out.println("parent constructor");
	}
}
class Dog extends Animal
{
	Dog()
	{
	super();
	System.out.println("child constructor");
	}

public static void main(String[]args)
{
Dog obj = new Dog();
}
}
