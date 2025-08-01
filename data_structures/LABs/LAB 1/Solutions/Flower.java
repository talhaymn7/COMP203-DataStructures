//Code: 91 pts

public class Flower // 3 pts
{ //1 pts
	String name; //3 pts
	int n_petals; //3 pts
	float price; //3 pts

	public Flower() {} //4 pts
	public Flower (String flower_name, int number_of_petals, float amount) //8 pts
	{//1 pts
		name = flower_name; //3 pts
		n_petals = number_of_petals; //3 pts
		price = amount; //3 pts
	} //1 pts
	
	public String getName() { return name; } //8 pts
	public int getNPetals() { return n_petals; } //8 pts
        public float getPrice() { return price; } // 8 pts

	public void setName(String flower_name) //5 pts
	{ //1 pts
		name = flower_name; //3 pts
	} //1 pts

	public void setNPetals(int number_of_petals) //5 pts
	{ //1 pts
                n_petals = number_of_petals; //3 pts
	} //1 pts

	public void setPrice(float amount) //5 pts
	{ //1 pts
                price = amount;	//3 pts
	} //1 pts
} //1 pts

