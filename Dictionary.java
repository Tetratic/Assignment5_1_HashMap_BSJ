/**
    A class to create and manipulate a Dictionary.
    @author Brian Johnston
    @version 1.0
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {

	private HashMap<Integer,String> h;
	private HashMap<String,String> h2;
	
	/**Constructor for dictionary hashmap.*/
	public Dictionary() {
		//h = new HashMap<Integer,String>();
		//previous attempt at running using hashCode to map keys to definitions
		//this attempt failed to have a proper solution to method 2, as the key was lost
		//the solution to this was to use a String,String hashmap and only use the hashCode() for method 3
		h2 = new HashMap<String,String>();
	}
	
	/**Adds a new entry into the dictionary*/
	public void load() {
		File f = new File("DictionaryWordValuePairs.txt");
		Scanner s;
		
		try {
			s = new Scanner(f);
			
			while(s.hasNextLine()) {
				String d[] = s.nextLine().split(",", 2);//limits the splitting to two elements, for definitions that have commas
				//h.put(d[0].hashCode(), d[1]);
				//previous attempt at hashmap using hashCode from java utils, see lines 20-23
				h2.put(d[0], d[1]);
				
			}
			s.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
	
	/**Prints all key and value pairs in the dictionary*/
	public void print() {
		for(Map.Entry<String,String> e : h2.entrySet()) {
			System.out.println("Key:\"" + e.getKey() + "\"; Value: \"" + e.getValue() + "\"");
		}
	}
	
	/**Searches the dictionary for a key, returning the value and hash if it exists.
	 * @param k  the key to search for.
	 * @return returns a formatted string with the key, the definition, and the generated hash.*/
	public String search(String k) {
		return "Key: \"" + k + "\"; Value: \"" + h2.get(k) + "\"; Hash: \"" + k.hashCode() + "\".";
	}
}
