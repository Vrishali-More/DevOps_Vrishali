package com;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubstractionTest {

	@Test
	public void test() {
	Substraction obj= new Substraction();
	assertEquals(4,obj.sub(6, 2));
	}

}
