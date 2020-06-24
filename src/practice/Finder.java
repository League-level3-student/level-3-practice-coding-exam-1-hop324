package practice;

import java.util.ArrayList;

public class Finder {
	 public int lastIndexOf(ArrayList<String> aye, String papi) {
		for(int i = aye.size()-1; i != 0; i--) {
			System.out.println(aye.get(i).toLowerCase());
			if(papi.toLowerCase()== aye.get(i).toLowerCase()) {
				return i;	
			}
		}
		return -1;
	}
}
