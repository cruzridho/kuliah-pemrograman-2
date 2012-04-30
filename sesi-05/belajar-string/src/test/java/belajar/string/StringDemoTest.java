package belajar.string;

import org.junit.*;
import static org.junit.Assert.*;

public class StringDemoTest{
	@Test
	public void bandingkanString(){
		String nama = "ridho";
		
		assertTrue(nama.equals("ridho"));
		assertFalse(nama.equals("adit"));
		
		assertTrue(nama.equalsIgnoreCase("Ridho"));
		assertFalse(nama.equals("Ridho"));
	}
	
	@Test
	public void awalanString(){
		String nama = "ridho pradana";
		assertTrue(nama.startsWith("ridho"));
		assertFalse(nama.startsWith("adit"));
	}
	
	@Test
	public void testPanjangString(){
		StringDemo sd = new StringDemo();
		String nama = "ridho";
		assertTrue(sd.jumlahHuruf(nama) == 5);
	}
	
	@Test
	public void testGantiString(){
		StringDemo sd = new StringDemo();
		String nama = "adit";
		assertEquals("adat", sd.ganti(nama, "i", "a"));
	}
}