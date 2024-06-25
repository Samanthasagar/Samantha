package apjfsa;

import java.util.LinkedHashMap;

public class DemoLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> countryCodes=new LinkedHashMap<String,Integer>();
		
		countryCodes.put("India",91);
		countryCodes.put("Russia",7);
		countryCodes.put("Austrialla",61);
		countryCodes.put("China",86);
		countryCodes.put("Pakisthan",92);
		
		System.out.println(countryCodes);
		
		System.out.println(countryCodes.keySet());
		System.out.println(countryCodes.values());
		System.out.println(countryCodes.isEmpty());
        System.out.println(countryCodes.size());
		System.out.println(countryCodes.entrySet());
		System.out.println(countryCodes.keySet());

		System.out.println(countryCodes.replace("Russia", 7,9));
	    System.out.println(countryCodes);
		

		


	}

}
