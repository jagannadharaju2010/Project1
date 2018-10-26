package pkg;

import java.util.LinkedHashMap;

public class ClassRoom {

	public static void main(String[] args) {
   LinkedHashMap<String,Integer> store=new LinkedHashMap<String,Integer>();
   store.put("PC", 2);
   store.put("Projector", 2);
   store.put("Chair", 130);
   store.put("Marker", 4);
   System.out.println(store.get("Chair"));
   System.out.println(store.containsKey("Projector"));
   if(store.containsKey("Projector")) {
	   System.out.println("Yes classroom has Projector");
   }
   else {
	   System.out.println("No ");
   }
	}

}
