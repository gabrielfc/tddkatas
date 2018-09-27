package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumberUtilTest {

    @Test
    public void testOneTwoThree() {
	assertEquals(RomanNumberUtil.arabicToRoman(1),"I");
	assertEquals(RomanNumberUtil.arabicToRoman(2),"II");
	assertEquals(RomanNumberUtil.arabicToRoman(3),"III");
    }
    
    @Test
    public void testFour() {
	assertEquals(RomanNumberUtil.arabicToRoman(4),"IV");
	
    }
    
    @Test
    public void testFive() {
	assertEquals(RomanNumberUtil.arabicToRoman(5),"V");
	
    }
    
    @Test
    public void testSixSevenEight() {
	assertEquals(RomanNumberUtil.arabicToRoman(6),"VI");
	assertEquals(RomanNumberUtil.arabicToRoman(7),"VII");
	assertEquals(RomanNumberUtil.arabicToRoman(8),"VIII");
	
    }
    
    @Test
    public void testNine() {
	assertEquals(RomanNumberUtil.arabicToRoman(9),"IX");
	
    }
    @Test
    public void testBigNumber() {
	assertEquals(RomanNumberUtil.arabicToRoman(597),"DXCVII");
	
    }

}
