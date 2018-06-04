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

/**
 * @author ajinkyarode
 *
 */
public class Main {
	private static final  String Filename= "Validity Take-Home Exercise.csv";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        HashMap<String,Integer> set = new HashMap<String,Integer>();
		
		/**
		 *Create a Util object for invoking a util methods
		 */
           Util util = new Util();
			

			set = util.readFile(Filename);
			
			util.ProcessFile(set);

		   
		
		
		
		
	}

}
