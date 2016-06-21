package com.github.baskireddy.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Utils {

	
	public Long[] randomLongs(int limit) {
		
		List<Long> values = new Random().longs(limit).collect(ArrayList::new,ArrayList::add,ArrayList::addAll);
		return values.toArray(new Long[0]);
	}
	
	public Long[] sortedRandomLongs(int limit) {
		Long[] v = this.randomLongs(limit);
		Arrays.sort(v);
		return v;
	}
	
	public Integer[] randomInts(int limit){
		ArrayList<Integer> v = new Random().ints(limit, 0, 1000).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		return v.toArray(new Integer[0]);
	}

	
	public Integer[] sortedRandomInts(int limit){
		ArrayList<Integer> v = new Random().ints(limit, 0, 1000).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		v.sort((x,y) -> x.compareTo(y));
		return v.toArray(new Integer[0]);
	}
	
}
