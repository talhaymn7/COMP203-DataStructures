//total grade: 396 pts for code + execution (excluding String) + 58 pts bonus for code + execution for String
	//total grade for code: 21+25*7+2=198 pts + 29 pts bonus for String
	//total grade for correct execution: 198 pts + 29 pts bonus for String

import java.util.Scanner; //4 pts

public class AllBaseTypes //3 pts
{ //1 pts

	public static void main(String[] args) //6 pts
	{ //1 pts
		Scanner input = new Scanner(System.in); //6 pts

		//Enter and print boolean (25 pts for this block)
                System.out.print("Please enter a boolean: "); //3 pts
                while (!input.hasNextBoolean()) //4 pts
                { //1 pts
                        input.nextLine(); //3 pts
                        System.out.print("Invalid boolean; please enter a boolean (true or false): "); //3 pts
                } //1 pts
		boolean boolean_value = input.nextBoolean(); //5 pts
		System.out.println("You entered: " + boolean_value); //5 pts
		
		//Enter and print byte (25 pts for this block)
		System.out.print("Please enter a byte: "); //3 pts
                while (!input.hasNextByte()) //4 pts
                { //1 pts
                        input.nextLine(); //3 pts
                        System.out.print("Invalid byte; please enter a byte: "); //3 pts
                } //1 pts
                byte byte_value = input.nextByte(); //5 pts
                System.out.println("You entered: " + byte_value); //5 pts

                //Enter and print short (25 pts for this block)
                System.out.print("Please enter a short: "); //3 pts 
                while (!input.hasNextShort()) //4 pts
                { //1 pts
                        input.nextLine(); //3 pts
                        System.out.print("Invalid short; please enter a short: "); //3 pts
                } //1 pts
                short short_value = input.nextShort(); //5 pts
                System.out.println("You entered: " + short_value); //5 pts

                //Enter and print int (25 pts for this block)
                System.out.print("Please enter an int: "); //3 pts
                while (!input.hasNextInt()) //4 pts
                { //1 pts
                        input.nextLine(); //3 pts
                        System.out.print("Invalid int; please enter a int: "); //3 pts
                } //1 pts
                int int_value = input.nextInt(); //5 pts
                System.out.println("You entered: " + int_value); //5 pts

                //Enter and print long (25 pts for this block)
                System.out.print("Please enter an long: "); //3 pts
                while (!input.hasNextLong()) //4 pts
                { //1 pts
                        input.nextLine(); //3 pts
                        System.out.print("Invalid long; please enter a long: "); //3 pts
                } //1 pts
                long long_value = input.nextLong(); //5 pts
                System.out.println("You entered: " + long_value); //5 pts

                //Enter and print float (25 pts for this block)
                System.out.print("Please enter a float: "); //3 pts
                while (!input.hasNextFloat()) //4 pts
                { //1 pts
                        input.nextLine(); //3 pts
                        System.out.print("Invalid float; please enter a float: "); //3 pts
                } //1 pts
                float float_value = input.nextFloat(); //5 pts
                System.out.println("You entered: " + float_value); //5 pts

                //Enter and print double (25 pts for this block)
                System.out.print("Please enter a double: "); //3 pts
                while (!input.hasNextDouble()) //4 pts
                { //1 pts
                        input.nextLine(); //3 pts
                        System.out.print("Invalid double; please enter a double: "); //3 pts
                } //1 pts
                double double_value = input.nextDouble(); //5 pts
                System.out.println("You entered: " + double_value); //5 pts

		//Enter and print String (29 pts for this block)
		System.out.print("Please enter a string: "); //3 pts
		String str = input.nextLine(); //5 pts

		while (!input.hasNextLine()) //4 pts
		{ //1 pts
			input.nextLine(); //3 pts
			System.out.print("Invalid string; please enter a string: "); //3 pts
		} //1 pts

		//String str = input.nextLine(); 
		str = input.nextLine(); //4 pts
		System.out.println("You entered: " + str); //5 pts

	} //1 pts
} //1 pts

