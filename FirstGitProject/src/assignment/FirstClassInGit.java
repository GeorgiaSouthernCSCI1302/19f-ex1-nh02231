package assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstClassInGit {
	
	private BufferedReader br;
	private String input;

	FirstClassInGit()
	{
		br = new BufferedReader(new InputStreamReader(System.in));
		try {
			run();
		} catch (IOException e) {
			System.out.println("Failed to read input");
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public void run() throws IOException
	{
		System.out.println("Hello my name is Nathan Heiland!");
		System.out.println("What is your last name?");
		input = br.readLine();
		System.out.println("Your last name is "+input+".");
	}
	
	public static void main(String[] args)
	{
		new FirstClassInGit();
		
		//add a statement to display your name in the console
		
		//Then commit your changes

	}

}
