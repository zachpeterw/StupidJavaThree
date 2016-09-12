package stupid.controller;

import java.util.Scanner;

public class StupidController 
{
	private String myName;
	private Scanner readKeyboardInput;
	
	public StupidController()
	{
	myName = "Zach Whitehead";	
	readKeyboardInput = new Scanner(System.in);
	}
	
	public void start()
	{
	System.out.println("This is slightly less stupid ;D");
	System.out.println("My name is " + myName);
	askQuestions();
	}
	
	private void askQuestions()
	{
		System.out.println("What is your name?");
		String userInput = readKeyboardInput.nextLine();
		System.out.println("You said " + userInput);
		
		if(userInput.equalsIgnoreCase("Zachary"))
		{
		System.out.println("You have the same name as me!!");
		}
		
		System.out.println("What did you eat for breakfast");
		String userInput1 = readKeyboardInput.nextLine();
		System.out.println(userInput1 + " thats disgusting.");
		
		System.out.println("What about this weather we are having?");
		String userInput2 = readKeyboardInput.nextLine();
		System.out.println(userInput2 + " I would agree, I enjoy the wintertime if you ask me.");
		
		System.out.println("What time do you wake up for school?");
		String userInput3 = readKeyboardInput.next();
		System.out.println("I cannot imagine wake up as early as " + userInput3);
		
		System.out.println("What do you bench?");
		String userInput4 = readKeyboardInput.next();
		System.out.println(userInput4 + ", please, do you even lift?");
		readKeyboardInput.nextLine();

		System.out.println("Any favorite movies?");
		String userInput5 = readKeyboardInput.nextLine();
		System.out.println(userInput5 + " is crap, find a better movie");
		
		System.out.println("My favorite movie is Ants, don't you love ants? What rating would you give it?");
		String userInput6 = readKeyboardInput.nextLine();
		System.out.println(userInput6 + " Isn't high enough! Too bad.");
		
		
		
	}
}
