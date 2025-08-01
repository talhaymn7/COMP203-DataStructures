//Code: 125 pts
//Execution: 125 pts

public class FlowerDemo // 3 pts
{ // 1 pts
	public static void main(String[] args) // 6 pts
	{ // 1 pts
		Flower flower1 = new Flower(); // 5 pts
		Flower flower2 = new Flower("rose", 15, 35); // 8 pts
	
		String flower_name_1 = flower1.getName(); // 5 pts 
		int n_petals_1 = flower1.getNPetals(); // 5 pts
		float price_1 = flower1.getPrice(); // 5 pts

                String flower_name_2 = flower2.getName(); // 5 pts
                int n_petals_2 = flower2.getNPetals(); // 5 pts
                float price_2 = flower2.getPrice(); // 5 pts
 
		System.out.println("Name of flower 1: " + flower_name_1); // 5 pts
                System.out.println("Number of petals in flower 1: " + n_petals_1); // 5 pts
                System.out.println("Price of flower 1: " + price_1); // 5 pts

                System.out.println("Name of flower 2: " + flower_name_2); // 5 pts
                System.out.println("Number of petals in flower 2: " + n_petals_2); // 5 pts
                System.out.println("Price of flower 2: " + price_2); // 5 pts

		flower1.setName("lily"); // 4 pts
		flower1.setNPetals(5); // 4 pts
		flower1.setPrice(45); // 4 pts

                flower_name_1 = flower1.getName(); // 4 pts
                n_petals_1 = flower1.getNPetals(); // 4 pts
                price_1 = flower1.getPrice(); // 4 pts

                System.out.println("Name of flower 1: " + flower_name_1); // 5 pts
                System.out.println("Number of petals in flower 1: " + n_petals_1); // 5 pts
                System.out.println("Price of flower 1: " + price_1); // 5 pts
	} // 1 pts
} // 1 pts

