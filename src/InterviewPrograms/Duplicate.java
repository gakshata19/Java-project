package InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class Duplicate {

	public static void main(String[] args) {
		String s= "butter&&batter    $$buffer$&%";
		Map<Object, Integer> m=new HashMap<Object, Integer>();
		for(int i=0; i<s.length(); i++) {
			Object o=s.charAt(i);
			if(m.containsKey(o)) {
				m.put(o, m.get(o)+1);
			}
			else {
				m.put(o,1);
			}
		}
		System.out.println(m);
	}	
}
