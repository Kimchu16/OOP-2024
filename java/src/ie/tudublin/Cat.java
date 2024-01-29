package ie.tudublin;

public class Cat extends animal {
    
    public Cat()
	{
		this.name = "rescue cat";
	}
	
	// A constructor that takes name
	public Cat(String name)
	{
		this.name = name;
	}

    public void speak(){
        System.out.println("Meow " + name);
    }
}
