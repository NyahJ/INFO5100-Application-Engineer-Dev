package Q4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Q4 {
	public boolean uniqueOccurrences(int[] arr) {
		Arrays.sort(arr);
		HashMap<Integer, Integer> occ = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			if(!occ.containsKey(arr[i])) {
				occ.put(arr[i], 1);
			}else {
				occ.put(arr[i], occ.get(arr[i]) + 1);
			}
		}
		
		ArrayList<Integer> occValue 
        = occ.values().stream().collect( 
            Collectors.toCollection(ArrayList::new)); 

		for (int i = 0; i < occValue.size() - 1; i++) {
			if(occValue.get(i) == occValue.get(i + 1)) {
				return false;
			}
		}	
		return true;
	}
}
