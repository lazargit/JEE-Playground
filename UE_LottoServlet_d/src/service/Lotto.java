package service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {
	
	

	public static Integer[] createNumbers(int n, int max){
		//TODO Exception
		if(n>=max){
			throw new IllegalArgumentException();
		}
		Set<Integer> zahlen = new HashSet<>();
		Random r = new Random();
		while (zahlen.size() < n) {
			zahlen.add(r.nextInt(max)+1);
		}
		
		
		
		return zahlen.toArray(new Integer[n] );// set to array
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(Lotto.createNumbers(455, 45)));
	
	}

}
