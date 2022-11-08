package collection2;

import java.util.HashMap;
import java.util.Map;

public class LmsTest {

	public static void main(String[] args) {
		HashMap<Integer,String>lms=new HashMap<>();
		lms.put(914, "nandini");
		lms.put(912, "nisha");
		lms.put(911, "raghul");
		lms.put(837, "nisha");
		/*for(Integer x:lms.keySet()) {
			System.out.println(x);
		}
		for(Integer x:lms.keySet()) {
			System.out.println(lms.get(x));
		}
		lms.forEach((x,y)->System.out.println(x+" "+y));
		lms.keySet().forEach(x->{System.out.println(x);});
		lms.values().forEach((x)-> {System.out.println(x);});
		for(Integer x:lms.keySet()) {
			if(x%2==0) {
				System.out.println(x+"is even "+lms.get(x));
			}
			else {
				System.out.println(x+"is odd ");
			}
		}
		lms.values().forEach(x-> {if(x.startsWith("n")) {
			System.out.println(x+" starts with n");
		}
		else {
			System.out.println(x+" does not start with n");
		}
			
		});*/
		for(Integer x: lms.keySet()) {
			if(lms.get(x).contains("a")||lms.get(x).contains("e")||lms.get(x).contains("i")||lms.get(x).contains("o")||lms.get(x).contains("u")) {
				System.out.println(lms.get(x)+" contains vowel");
			}
		}
		
		

	}

}
