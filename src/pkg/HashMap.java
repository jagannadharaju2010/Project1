package pkg;

import java.util.LinkedHashMap;

public class HashMap {

	public static void main(String[] args) {
       LinkedHashMap<String,String> map=new LinkedHashMap<String,String>();
       map.put("City", "Bangalore");
       map.put("Name", "Jagan");
       map.put("Eid", "A1");
       map.put("Name", "Raju");
       System.out.println(map.get("Name"));
       System.out.println(map.get("name"));
       System.out.println(map.keySet());
       System.out.println(map.values());
       System.out.println(map.containsKey("Name"));
       System.out.println(map.containsKey("Area"));
       // In hashmap values are stored in "Key" instead of index
       // Key is case sensitive and it can't be duplicate
       //LinkedHashMap will preserve insertion order
       
       
       
       
	}

}
