//Code: 66 pts
//Execution: 66 pts

public class NoPunctuation //3 pts
{ //1 pts
	public static void main(String[] args) //6 pts
	{ //1 pts
		StringBuilder s = new StringBuilder(); //5 pts
                StringBuilder s_new = new StringBuilder(); //5 pts

		s.append("Let's try, Mike!"); //4 pts
		String punctuation = ",.:?!;-(){}[]`\"\'"; //4 pts
		for (int i=0; i < s.length(); i++) //12 pts
			if (!punctuation.contains(s.substring(i,i+1))) //10 pts
				s_new.append(s.substring(i,i+1)); //9 pts
	
                System.out.println(s_new.toString()); //4 pts
	} //1 pts
} //1 pts

