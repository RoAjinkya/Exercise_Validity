package com.exercise.validity;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

public class Util {
	
	public HashMap<String,Integer> readFile(String fileName) {
		
		BufferedReader br = null;
		FileReader fr = null;
		HashMap<String,Integer> set = new HashMap();
		
		
		try {
			fr= new FileReader(fileName);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return set;
	}

}
