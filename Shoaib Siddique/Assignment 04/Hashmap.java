package com.java.Module4;
import java.util.HashMap;
import java.util.Map;

public class Hashmap {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			HashMap <Integer, String> hasgMap = new HashMap<>();
			
			hasgMap.put(1, "Akbar Ali");
			hasgMap.put(2, "Akhila");
			hasgMap.put(3, "Bikesh");
			hasgMap.put(4, "Soundarya");
			hasgMap.put(5, "Shoaib Siddiqui");
			hasgMap.put(6, "Triveni Potla");
			hasgMap.put(7, "Madhuri");
			hasgMap.put(8, "Gopal");
			hasgMap.put(9, "Rukmini");
			hasgMap.put(10, "Sunil");
			hasgMap.put(11, "Usha");
			hasgMap.put(12, "Tejash");
			
			
			System.out.println("Itereating hashmap:");
			
			for(Map.Entry m: hasgMap.entrySet()) {
				System.out.println(m.getKey()+" "+m.getValue());
			}

			
			
			

		}

	}