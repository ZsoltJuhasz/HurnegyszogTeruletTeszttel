import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class CalcerTest {
    Calcer calcer;

    @BeforeEach
    void setUp(){
        calcer = new Calcer();
    }

    @Test
    void calcAreaNormal1Test(){
        double aSide = 30;
        double bSide = 35;
        double cSide = 40;
        double dSide = 45;
        calcer.setSides(aSide, bSide, cSide, dSide);
        double actual = calcer.calcArea();
        double expected = 1374.77;
        assertEquals(expected, actual, 0.01);  //harmadik paraméter az a lehetséges eltérés
    }

    @Test
    void calcAreaNormal2Test(){
        double aSide = 100;
        double bSide = 105;
        double cSide = 110;
        double dSide = 115;
        calcer.setSides(aSide, bSide, cSide, dSide);
        double actual = calcer.calcArea();
        double expected = 11524.97;
        assertEquals(expected, actual, 0.01); 
    }

    @Test
    void calcAreaMinTest(){
        double aSide = 1;
        double bSide = 1;
        double cSide = 1;
        double dSide = 1;
        calcer.setSides(aSide, bSide, cSide, dSide);
        double actual = calcer.calcArea();
        double expected = 1.0;
        assertEquals(expected, actual); //nem kell eltérés, mert nincs
    }

    @Test
    void calcAreaNegativeTest(){
        double aSide = 30;
        double bSide = 35;
        double cSide = 40;
        double dSide = -5;
        calcer.setSides(aSide, bSide, cSide, dSide);
        double actual = calcer.calcArea();
        double expected = -1;  // az az elvárt, hogy adjon valamilyen hibát
        assertEquals(expected, actual); 
    }



}
