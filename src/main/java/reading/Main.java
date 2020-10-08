package reading;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//import static org.junit.Assert.*;  

//import org.junit.Test;  

public class Main {
	public static ArrayList<String> read(){
		String inputfile = "test.txt";
		System.out.println("FILE CONTENT");
		
		System.out.println();
		 try {
			 String line;
			BufferedReader br = new BufferedReader(new FileReader(inputfile));
			ArrayList<String> word = new ArrayList<String>();
			ArrayList<String> phrase = new ArrayList<String>();
			
			while ((line = br.readLine()) != null) {
				int checkIfWord = 0;
				System.out.println(line);
				for (int i = 0; i < line.length(); i++) {
					//System.out.print(s.charAt(i));
					if(line.charAt(i)==' ') {
						phrase.add(line);
						checkIfWord++;
						break;
					}
				}
				if(checkIfWord==0) {
					word.add(line);
				}
			}
			Collections.sort(word);
			Collections.sort(phrase);
			word.sort((s1, s2) -> s1.length() - s2.length());
			phrase.sort((s1, s2) -> s1.length() - s2.length());
			
			System.out.println();
			System.out.println("WORDS");
			System.out.println();
			for(String s:word) {
				System.out.println(s);
			}
			
			System.out.println();
			System.out.println("PHRASES");
			System.out.println();
			for(String s:phrase) {
				System.out.println(s);
			}
			
			if(phrase.size()>word.size()) {
				 return phrase;
			 }
			else {
				return word;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 return null;
		 
	}
	/*
	 @Test  
	 public void testFindMax(){  
	        assertTrue(read().size(),5);  
	 }*/
	public static void main(String[] args) {
		
	read();
	 
	}
	
	
	
	
}
