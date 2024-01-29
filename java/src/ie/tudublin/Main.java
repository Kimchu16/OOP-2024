
// Packages must match the folder structure
package ie.tudublin;

public class Main
{

	public void helloProcessing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new HelloProcessing());
    }

	public void MyFirstProcessing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new MyFirstProcessing());
    }

	public void doDogStuff()
	{
		// Create a new Dog called Misty
		// Call the constructor
		Dog misty = new Dog("Misty");
		misty.speak();

        Dog lucy = new Dog("Lucy");
		lucy.speak();
	}

	public void doCatStuff()
	{
		// Put your code here
		System.out.println("cats are from space");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Hello world");
		
		
		Main m = new Main();

		m.doDogStuff();

		m.doCatStuff();

		m.MyFirstProcessing();

		Dog nuala = new Dog("Nuala");
		nuala.speak();

		Cat Milo = new Cat();
		Milo.speak();

		animal larry = new Dog("Larry");
		larry.speak();
		larry = new Cat();
		larry.speak();
		
		animal a = new Dog("A");
		animal b = new Dog("B");
		animal c = a;



	}
	
}