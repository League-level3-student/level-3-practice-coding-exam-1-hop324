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
		for(int i = 0; i < ree.size(); i++) {
			for(int g = 0; g < ree.get)
		}
		return null;
		
	}
}
