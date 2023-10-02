/**
    A class to test the creation and searching of a dictionary using a hashmap.
    @author Brian Johnston
    @version 1.0
*/
public class Application {

	public static void main(String[] args) {
		
		Dictionary d = new Dictionary();
		d.load();
		
		d.print();
		
		System.out.println("\n\n");
		
		System.out.println(d.search("fain"));
		System.out.println(d.search("timbrel"));
		System.out.println(d.search("wait on/upon"));
		System.out.println(d.search("scullion"));
		System.out.println(d.search("betimes"));
		System.out.println(d.search("faint"));//not in dictionary, should return null
	}

}
