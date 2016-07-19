package com.mohamed;

import static org.junit.Assert.*;

public class Test extends Multiple  {

	@org.junit.Test
	public void test() {
		try{
		Test cc = new Test();
		cc.displayMagicalNumber(0, 50);
		}
		catch (Exception e){
		assertTrue(e.getMessage(),false);
		}
		
	}

}
