// Java program to illustrate HashMap class of java.util
// package

// Importing HashMap class
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

// Main class
public class LexErrors {

	// Main driver method
	public static void main(String[] args) throws FileNotFoundException
	{
		//takes in sample txt file 
		Scanner s = new Scanner(new File("./code2.txt"));
		ArrayList<String> listLines = new ArrayList<String>();
		ArrayList<String> masterArray = new ArrayList<String>();
		while (s.hasNext()){
		    listLines.add(s.next());
		}
		s.close();
		for (int i = 0; i < listLines.size();i++) 
	    { 	
	    	//calls the Regex file to tokenize each lexeme					
			String word = listLines.get(i);
			String token = Regex.match(word);
			String result = "[" + token + "]" + " " + word; 
			masterArray.add(result);
	    } 
		Set<String> outPut = new LinkedHashSet<>(masterArray);		
		Iterator<String> itr = outPut.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
	}
}
