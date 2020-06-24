package practice;

import java.util.HashMap;

public class FishingContest {
	public HashMap<String, double[]> ree;
	public FishingContest(HashMap<String, double[]> allCatches) {
		ree = allCatches;
	}
	public double findBiggestFish(String string) {
		double num = 0;
		double min;
		for(int i = 0; i < ree.get(string).length; i++) {
			min = ree.get(string)[i];
			if(min > num) {
				num = min;
			}
		}
		return num;
	}

	public String findWinner() {
		double contestant = 0;
		double contwostant = 0;
		double conthreestant = 0;
		if(ree.containsKey("john")) {
			for(int g = 0; g < ree.get("john").length; g++) {
				if(ree.get("john")[g] >= 3.0) {
					contestant += ree.get("john")[g];
				}
			}
		}
		if(ree.containsKey("esme")) {
			for(int g = 0; g < ree.get("esme").length; g++) {
				if(ree.get("esme")[g] >= 3.0) {
					contwostant += ree.get("esme")[g];
				}
			}
		}
		if(ree.containsKey("isis")) {
			for(int g = 0; g < ree.get("isis").length; g++) {
				if(ree.get("isis")[g] >= 3.0) {
					conthreestant += ree.get("isis")[g];
				}
			}
		}
		if(contestant > contwostant && contestant > conthreestant) {
		    return "john";
		}
		else if(contwostant > contestant && contwostant > conthreestant) {
			return "esme";
		}
		else if(conthreestant > contwostant && conthreestant > contestant) {
		return "isis";
		}
		return "david";
	}
}
