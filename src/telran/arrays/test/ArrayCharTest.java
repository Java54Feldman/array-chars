package telran.arrays.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.arrays.ArrayChar;

class ArrayCharTest {

	@Test
	void compareToTest() {
		char[] ar1 = {'1', '2', '3'}; //"123"
		char[] ar2 = {'9'};
		char[] ar3 = {'1', '2', '3'}; 
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);
		
		assertEquals(8, arrayChar2.compareTo(arrayChar1));
		assertEquals(-8, arrayChar1.compareTo(arrayChar2));
		assertEquals(1, new ArrayChar(new char[] {'a', 'a'})
				.compareTo(new ArrayChar(new char[] {'a'})));
		assertEquals(-1, new ArrayChar(new char[] {'a'})
				.compareTo(new ArrayChar(new char[] {'a', 'a'})));
		assertEquals(0, arrayChar1.compareTo(arrayChar3));
	}
	@Test
	void indexOfTest() {
		char[] ar1 = {'1', '2', '3', '2'}; //"1232"
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		assertEquals(1, arrayChar1.indexOf('2'));
		assertEquals(-1, arrayChar1.indexOf('9'));
	}
	@Test
	void lastIndexOfTest() {
		char[] ar1 = {'1', '2', '3', '2'}; //"1232"
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		assertEquals(3, arrayChar1.lastIndexOf('2'));
		assertEquals(-1, arrayChar1.lastIndexOf('9'));
	}
	@Test
	void countTest() {
		char[] ar1 = {'1', '2', '3', '2'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		assertEquals(2, arrayChar1.count('2'));
		assertEquals(1, arrayChar1.count('3'));
		assertEquals(0, arrayChar1.count('a'));
		
	}
	@Test
	void compareToIgnoreCaseTest() {
		char[] ar1 = {'B', 'E', 'N', 'A'};
		char[] ar2 = {'a', 'l', 'n', 'a' };
		char[] ar3 = {'b', 'e', 'n', 'a'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);
		assertEquals(1, arrayChar1.compareToIgnoreCase(arrayChar2));
		assertEquals(-1, arrayChar2.compareToIgnoreCase(arrayChar1));
		assertEquals(0, arrayChar1.compareToIgnoreCase(arrayChar3));
		
	}
	@Test
	void containsTest() {
		char[] ar1 = {'1', '2', '3', '2'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		assertTrue(arrayChar1.contains('3'));
		assertFalse(arrayChar1.contains('a'));
		
	}
	@Test
	void containsOutsideUpdateTest() {
		char[] ar1 = {'1', '2', '3', '2'}; //"1232"
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ar1[2] = 'a';
		assertTrue(arrayChar1.contains('3'));
		assertFalse(arrayChar1.contains('a'));
	}
	@Test
	void equalsTest() {
		char[] ar1 = {'B', 'E', 'N', 'A'};
		char[] ar2 = {'B', 'E', 'N', 'A'};
		char[] ar3 = {'b', 'e', 'n', 'a'};
		char[] ar4 = {'B', 'E', 'N'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);
		ArrayChar arrayChar4 = new ArrayChar(ar4);
		assertTrue(arrayChar1.equals(arrayChar2));
		assertFalse(arrayChar1.equals(arrayChar3));
		assertFalse(arrayChar1.equals(arrayChar4));
		assertFalse(arrayChar1.equals(null));
		
	}
	@Test
	void equalsIgnoreCaseTest() {
		char[] ar1 = {'B', 'E', 'N', 'A'};
		char[] ar2 = {'B', 'E', 'N', 'A'};
		char[] ar3 = {'b', 'e', 'n', 'a'};
		char[] ar4 = {'B', 'E', 'N'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);
		ArrayChar arrayChar4 = new ArrayChar(ar4);
		assertTrue(arrayChar1.equalsIgnoreCase(arrayChar2));
		assertTrue(arrayChar1.equalsIgnoreCase(arrayChar3));
		assertFalse(arrayChar1.equalsIgnoreCase(arrayChar4));
		assertFalse(arrayChar1.equals(null));
	}
}