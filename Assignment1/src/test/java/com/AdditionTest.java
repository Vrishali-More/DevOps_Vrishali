package com;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTest {

	@Test
	public void test() {
	Addition add= new Addition();
	assertEquals(4,add.Add(2, 2));
	}


}
