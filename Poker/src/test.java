import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class test {
	public static void main(String args[]){
		Map<Integer,Integer> numCount = new HashMap<Integer,Integer>();
		numCount.put(1,2);
		numCount.put(4,5);
		numCount.put(6,10);
		System.out.println(numCount.values());
		
		List<Integer> l =new ArrayList<Integer>();
		l.add(3);
		l.add(6);
		l.add(4);
		l.add(9);
		Collections.sort(l);
		for (Integer integer : l) {
			   System.out.print(integer+" ");
		}
		
		
		
		
		
	}

}
