import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Pract {
	static void samp(String a, String... b){
		System.out.println("first value is:" + a);
		for(String s: b)
			System.out.println(s);
	}	
	
	public static void main(String args[]){
		samp("hai","two","three");
		String[] a = {"a","b"};
		HashMap<String, String> m = new HashMap<String, String>(){{
			put("z","a");
			put("y","b");
		}
	};
	
	System.out.println(m.keySet());
	}
	

}