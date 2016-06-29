package chefandway.com;

import java.util.*;

public class CHRL4 {
    
	public static void main (String[] args) throws java.lang.Exception {
	    
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int k = sc.nextInt();
	    LinkedList<point> list = new LinkedList<point>();
        int[] streets = new int[n];
        long[] result= new long[n];

        for (int i = 0; i < n; i++) {
            streets[i] = sc.nextInt();
        }
        result[0] = streets[0];
        list.addFirst(new point(Math.log(streets[0]), 0));
        
        for (int i = 1; i < n; i++) {
            
            while(i - list.peekFirst().vertex > k) list.removeFirst();
 
            int x = list.peekFirst().vertex; 
            result[i] = result[x] * streets[i] % 1000000007;
            double log = list.getFirst().log + Math.log(streets[i]);
            
            while(list.getLast().log > log) list.removeLast();
            
            list.addLast(new point(log, i));
      }
    System.out.println(result[n-1]);
    sc.close();
    }
}
//constructor 
class point {
        
        double log;
        int vertex;
        
    point(double log, int vertex) {
        
        this.log = log;
        this.vertex = vertex;
    }
}