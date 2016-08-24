package printingmap.com;

import java.util.*;

public class printingMap {

	public static void print (HashMap<Integer[],Integer> map) {
		
		for (Map.Entry<Integer[], Integer> entry : map.entrySet()) {
			Integer[] key = entry.getKey();
	    	Integer value = entry.getValue();
	    	System.out.println("key, " + Arrays.toString(key) + " value " + value);
		}
	}
}
