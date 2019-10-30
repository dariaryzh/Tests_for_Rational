import org.junit.Test;
import static org.junit.Assert.*;

public class Tests {
    @Test
    public void testStandardConstructor() {
        Rational standard = new Rational();
        assertEquals("Standard constructor returns wrong numerator", 0, standard.getNumerator());
        assertEquals("Standard constructor returns wrong denominator", 1, standard.getDenominator());
    }

    @Test
    public void testCreation() {
        Rational rational = new Rational(1,3);
        assertEquals( 1, rational.getNumerator());
        assertEquals(3, rational.getDenominator());
    }

    @Test
    public void testCreationReduce() {
        Rational rational = new Rational(2,4);
        assertEquals( 1, rational.getNumerator());
        assertEquals(2, rational.getDenominator());
    }

    @Test
    public void testCreationWithMinus() {
        Rational rational = new Rational(1,-4);
        assertEquals( -1, rational.getNumerator());
        assertEquals(4, rational.getDenominator());
    }

    @Test
    public void testEquals(){
        Rational rational1 = new Rational(1,4);
        Rational rational2 = new Rational(1,4);
        Rational rational3 = new Rational(3,5);
        assertTrue(rational1.equals(rational2));
        assertFalse(rational1.equals(rational3));
    }

    @Test
    public void testLess(){
        Rational rational1 = new Rational(1,4);
        Rational rational2 = new Rational(3,4);
        assertTrue(rational1.less(rational2));
        assertFalse(rational2.less(rational1));
    }

    @Test
    public void testLessOrEqual(){
        Rational rational1 = new Rational(1,4);
        Rational rational2 = new Rational(3,4);
        Rational rational3 = new Rational(2,8);
        assertTrue(rational1.lessOrEqual(rational2));
        assertTrue(rational1.lessOrEqual(rational3));
        assertFalse(rational2.lessOrEqual(rational1));
    }

    @Test
    public void testPlus(){
        Rational rational1 = new Rational(4,5);
        Rational rational2 = new Rational(1,6);
        Rational rational3 = new Rational(29,30);
        assertEquals(rational3, rational2.plus(rational1));
    }

    @Test
    public void testMultiply(){
        Rational rational1 = new Rational(4,5);
        Rational rational2 = new Rational(1,6);
        Rational rational3 = new Rational(4,30);
        assertEquals(rational3, rational2.multiply(rational1));
    }

    @Test
    public void testMinus(){
        Rational rational1 = new Rational(4,5);
        Rational rational2 = new Rational(1,6);
        Rational rational3 = new Rational(19,30);
        assertEquals(rational3, rational1.minus(rational2));
    }

    @Test
    public void testDivide(){
        Rational rational1 = new Rational(4,5);
        Rational rational2 = new Rational(1,6);
        Rational rational3 = new Rational(24,5);
        assertEquals(rational3, rational1.divide(rational2));
    }

}
