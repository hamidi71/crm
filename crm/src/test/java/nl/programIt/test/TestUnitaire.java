package nl.programIt.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestUnitaire {
	
	@Before
	public void before(){
		System.out.println("test");
	}
	@Test
	public void test(){
		String s1="baddi";
		String s2="badi";
		assertNotSame(s1, s2);
	}
	@Test
	public void test2(){
		String s1="baddi";
		String s2="baddi";
		assertSame(s1, s2);
	}
	
	
	
	@After
	public void after(){
		System.out.println("after");
	}

}
