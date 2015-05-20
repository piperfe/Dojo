import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by macbook on 5/19/15.
 */
public class RommanCalculatorTest {

    RommanCalculator rommanCalculator;
    @Before
    public void setUp() {
        rommanCalculator = new RommanCalculator();
    }

    @Test
    public void testSumIAndI (){
        String primerNumeral = "I";
        String segundoNumeral = "I";

        String result = rommanCalculator.sum(primerNumeral, segundoNumeral);
        assertEquals("II", result);

    }

    @Test
    public void testSumXAndX() {
        String primerNumeral = "X";
        String segundoNumeral = "X";

        String result = rommanCalculator.sum(primerNumeral, segundoNumeral);
        assertEquals("XX", result);
    }

    @Test
    public void testSumIIAndII() {
        String primerNumeral = "II";
        String segundoNumeral = "II";

        String result = rommanCalculator.sum(primerNumeral, segundoNumeral);
        assertEquals("IV", result);
    }

    @Test
    public void testSumXXAndXX() {
        String primerNumeral = "XX";
        String segundoNumeral = "XX";

        String result = rommanCalculator.sum(primerNumeral, segundoNumeral);
        assertEquals("XL", result);
    }

    @Test
    public void testSumIIIAndII() {
        String primerNumeral = "III";
        String segundoNumeral = "II";

        String result = rommanCalculator.sum(primerNumeral, segundoNumeral);
        assertEquals("V", result);
    }

    @Test
    public void testSumIIIAndIII() {
        String primerNumeral = "III";
        String segundoNumeral = "III";

        String result = rommanCalculator.sum(primerNumeral, segundoNumeral);
        assertEquals("VI", result);
    }

    @Test
    public void testSumVAndI() {
        String primerNumeral = "V";
        String segundoNumeral = "I";

        String result = rommanCalculator.sum(primerNumeral, segundoNumeral);
        assertEquals("VI", result);
    }

    @Test
    public void testSumXXXAndXX() {
        String primerNumeral = "XXX";
        String segundoNumeral = "XX";

        String result = rommanCalculator.sum(primerNumeral, segundoNumeral);
        assertEquals("L", result);
    }

    @Test
    public void testSumCCCAndCC() {
        String primerNumeral = "CCC";
        String segundoNumeral = "CC";

        String result = rommanCalculator.sum(primerNumeral, segundoNumeral);
        assertEquals("D", result);
    }

    @Test
    public void testSumVandV() {
        String primerNumeral = "V";
        String segundoNumeral = "V";

        String result = rommanCalculator.sum(primerNumeral, segundoNumeral);
        assertEquals("X", result);
    }

    @Test
    public void testSumLandL() {
        String primerNumeral = "L";
        String segundoNumeral = "L";

        String result = rommanCalculator.sum(primerNumeral, segundoNumeral);
        assertEquals("C", result);
    }
    @Test
    public void testSumDandD() {
        String primerNumeral = "D";
        String segundoNumeral = "D";

        String result = rommanCalculator.sum(primerNumeral, segundoNumeral);
        assertEquals("M", result);
    }
    @Test
    public void testSumXVandV() {
        String primerNumeral = "XV";
        String segundoNumeral = "V";

        String result = rommanCalculator.sum(primerNumeral, segundoNumeral);
        assertEquals("XX", result);
    }
//    @Test
//    public void testSumXVandXV() {
//        String primerNumeral = "XV";
//        String segundoNumeral = "XV";
//
//        String result = rommanCalculator.sum(primerNumeral, segundoNumeral);
//        assertEquals("XXX", result);
//    }



}