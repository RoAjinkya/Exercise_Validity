package com.exercise.validity;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ajinkyarode
 *
 */
public class Util {
	
	/**
	 * @param fileName
	 * @return Hashmap containing records with the number of times that record appear.
	 */
	public HashMap<String,Integer> readFile(String fileName) {
		
		BufferedReader br = null;
		FileReader fr = null;
		HashMap<String,Integer> set = new HashMap<String, Integer>();
		
		
		try {
			fr= new FileReader(fileName);
			br = new BufferedReader(fr);
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				
				if(!set.containsKey(sCurrentLine)) {
					set.put(sCurrentLine,1);
				}
				else {
					set.put(sCurrentLine, set.get(sCurrentLine)+1 );
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return set;
	}

	
	/**
	 * @param map 
	 * This method will process the hashmap and prints the result of duplicate and non duplicate records
	 */
	public void ProcessFile(HashMap<String,Integer> map) {
		
		
		 int i=1;
		    for (Map.Entry<String, Integer> entry : map.entrySet()) {
		    	if(!entry.getValue().equals(1)) {
		    		 System.out.println("Dublicate set " + i++ +":");
              	 for(int j=0;j<(int)entry.getValue();j++)
				     System.out.println("ID : " + entry.getKey());
		    	}
			}
		    
		    System.out.println("\n\nNon-Dublicate ");
	    for (Map.Entry<String, Integer> entry : map.entrySet()) {
	    	if(entry.getValue().equals(1))
	    	{
	    		String[] outputString = entry.getKey().split(",");
	    		try {
	    			System.out.println(outputString[1] +" "+outputString[2]+","+ outputString[10]);
	    		}
	    		catch(Exception e) {
	    			System.out.println("Data Incompelete");
	    		}
	    		
	    		
	    	}
		
		}
	}
}
