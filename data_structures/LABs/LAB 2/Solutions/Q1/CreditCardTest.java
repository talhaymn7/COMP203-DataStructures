//46 pts
 
public class CreditCardTest //3 pts
{ //1 pts

	public static void main(String [] args) //6 pts
	{ //1 pts
		PredatoryCreditCard card = new PredatoryCreditCard("Zafer Aydın", "Vakifbank", "0000-0000-0000-0000", 1000, 0.0, 0.2, 0); //12 pts

		for (int i=0; i < 15; i++) //11 pts
			card.charge(1); //4 pts		

		System.out.println("New balance = " + card.getBalance()); //6 pts

	} //1 pts
} //1 pts

