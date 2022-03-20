package com.assignment2;

public class ShallowClone1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vals= {4,8,3};
		ShallowClone e = new ShallowClone(vals);
		e.showData();
		vals[0] = 15;
		e.showData();

	}

}
