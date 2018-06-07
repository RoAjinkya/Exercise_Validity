package validity.validity;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import info.debatty.java.stringsimilarity.Levenshtein;



/**
 * @author ajinkyarode
 *Helper Class for Levenshtein distance calculation and finding deduplication
 */
public class Helper {
	final static int LevenshteinThreshold = 40;
	final static int LevenshteinThresholdForCompanyName = 20;
	
	
   /**
 * @param fileName
 * @return ListofPersons
 * read the csv file , convert it to person objects add it to list and returns it.
 */
public List<Person> ReadFile(String fileName) {
		
	   BufferedReader br = null;
		  FileReader fr = null;
       List<Person> personList = new ArrayList<Person>();
      	try {
			fr= new FileReader(fileName);
			br = new BufferedReader(fr);
			String sCurrentLine;
			sCurrentLine = br.readLine();
			while ((sCurrentLine = br.readLine()) != null) {
				String[] TempPerson = sCurrentLine.split(",");
		
				try {
					Person p1 = new Person(TempPerson[1], TempPerson[2], TempPerson[3], TempPerson[3], TempPerson[4],TempPerson[6], TempPerson[7], TempPerson[8], TempPerson[9], TempPerson[10]);
					personList.add(p1);	
				}catch (Exception e) {
					System.out.println("Can not add data -- Data Incompelete");
				}
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return personList;
	}
   
   
   /**
 * @param personList
 * @return Duplicate persons list
 * takes the total list of persons calculate the Levenshtein distance between them, 
 * if they are less than threshold add it to duplicates list.
 *  return the duplicate list 
 */
public List<Person> CalculateDuplicate(List<Person> personList) {
	   
	   
	   List<Person> duplicatePersonList = new ArrayList<Person>();
       Levenshtein l = new Levenshtein();
       
       for(int i=0 ; i<personList.size();i++) {
     	  
     	  for(int j=i+1;j<personList.size();j++) {
     		  if(l.distance(personList.get(i).getCompany(), personList.get(j).getCompany()) <LevenshteinThresholdForCompanyName) 
      
     		 if(l.distance(personList.get(i).toString(), personList.get(j).toString()) <LevenshteinThreshold) {
     			
 				 duplicatePersonList.add(personList.get(j));
 				 duplicatePersonList.add(personList.get(i));
     		 }
     	  }

     	  
       }
    
     //  personList.removeAll(duplicatePersonList);
      
       final Set<Person> contactsBackup = new HashSet<Person>(duplicatePersonList);
       List<Person> finalDuplicate = new ArrayList<Person>(contactsBackup);
       
       Collections.sort(finalDuplicate, new Sortbyname());
       
       return finalDuplicate;
      
       
   }
   
   /**
 * @param finalDuplicate
 * @param personList
 * takes as a parameters and print the result sets duplicates and non duplicates.
 */
public void PrintResults(List<Person> finalDuplicate,List<Person> personList) {
	   
	   personList.removeAll(finalDuplicate);
	   
	   
       System.out.println("\n\nDuplicate Sets---");
       for(Person p: finalDuplicate) {
     	  System.out.println(p.toString());
     	 
       }
      
     
       
       System.out.println("\n\nNon Duplicates----");
       for(Person p: personList) {
     	  System.out.println(p.getFirstname()+" "+p.getLastname()+","+p.getState());
     	 
       }
               
	   
   }
	

}
