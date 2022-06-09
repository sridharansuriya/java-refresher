package com.bodhi;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>(); // For thread safe implementation use concurrent hashmap
		map.put("name", "suriya");
		map.put("role", "developer");
		map.put("organization", "innova");
		
		for(Entry<String, String> entry: map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
