package com.class20_other;

import com.class20.MySonMath;
import com.class20.Myself;
import com.class20.USA;

public class Mexico {

	public static void main(String[] args) {
		
		// when public 
		USA us2 = new USA ();
		System.out.println("Access from Mexico class");
		System.out.println(us2.mainState);
		
		// When USA is default
		// I cannot access USA class
		
		
		MySonMath son = new MySonMath();
		son.add1();
		
		Myself me = new Myself ();
	}

}
