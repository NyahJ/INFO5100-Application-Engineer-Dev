package Q3;

import java.util.Arrays;

public class Q3 {
	public boolean isAngram(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(tt);
        Arrays.sort(ss);
        if(ss.length != tt.length) return false;
        for(int i = 0; i < ss.length; i++)
        	if(ss[i] != tt[i]) {
        		return false;
        }
        return true; 	
	}

}
