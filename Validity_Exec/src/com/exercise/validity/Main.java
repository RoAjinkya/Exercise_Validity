package com.exercise.validity;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
	private static final  String Filename= "Validity Take-Home Exercise.csv";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = null;
		FileReader fr = null;
        HashMap<String,Integer> set = new HashMap();
		
		try {
			fr= new FileReader(Filename);
			br = new BufferedReader(fr);

			
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				//System.out.println(sCurrentLine);
				
				if(!set.containsKey(sCurrentLine)) {
					set.put(sCurrentLine,1);
				}
				else {
					set.put(sCurrentLine, set.get(sCurrentLine)+1 );
				}
			}
					    
			 int i=1;
			    for (Map.Entry<String, Integer> entry : set.entrySet()) {
			    	if(!entry.getValue().equals(1)) {
			    		 System.out.println("Dublicate set " + i++ +":");
	                 	 for(int j=0;j<(int)entry.getValue();j++)
					     System.out.println("ID : " + entry.getKey());
			    	}
				}
			    System.out.println("Non-Dublicate ");
		    for (Map.Entry<String, Integer> entry : set.entrySet()) {
		    	if(entry.getValue().equals(1))
		    	{
		    		String[] outputString = entry.getKey().split(",");
		    		try {
		    			System.out.println(outputString[1] +" "+ outputString[10]);
		    		}
		    		catch(Exception e) {
		    			System.out.println(outputString[1]);
		    		}
		    		
		    		
		    	}
			//	System.out.println("ID : " + entry.getKey());
			}
		   
							
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
