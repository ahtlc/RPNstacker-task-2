import java.io.FileNotFoundException;

import java.util.*;

import token.Token;
import token.TokenType;

public class Main {
	  public static void main(String[] args) {
		  try {
			  System.out.println("//Token List");
			  ReadFile r = new ReadFile();
			  List<Token> tokens = r.readFile();
			  int response = new RPN().RPNalgorithm(tokens);
			  System.out.println("\nResult is " + response);
		  }
		  
		  catch (FileNotFoundException e) {
			  System.out.println("An error occurred.");
			  e.printStackTrace();
		  }
	  }
	}