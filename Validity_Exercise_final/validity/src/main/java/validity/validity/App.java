package validity.validity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ajinkyarode
 *
 */
public class App 
{

	final static String Filename= "Validity Take-Home Exercise.csv";
    /**
     * @param args
     * main function for the app
     */
    
    public static void main( String[] args )
    {
        
    	/*
    	 * Create List of persons and list of duplicates for future reference
    	 */
    	List<Person> listOfPerson = new ArrayList<Person>();
    	List<Person> listofDuplicates = new ArrayList<Person>();
    	
    	/*
    	 * create helper object and invoke methods on it.
    	 */
    	Helper h = new  Helper();
    	/*
    	 * read file get a list of person
    	 */
    	listOfPerson = h.ReadFile(Filename);
    	
    	/*
    	 * get a list of duplicates form list of Persons
    	 */
    	listofDuplicates = h.CalculateDuplicate(listOfPerson);
    	
    	/*
    	 * print the result
    	 */
    	h.PrintResults(listofDuplicates,listOfPerson);
    	
    	/*
    	 * end of program
    	 */
    	
    	
    	
    	
    }
}
