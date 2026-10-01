package se1.ws26.tests.uebung1;

import org.hbrs.se1.ws26.exercises.uebung1.control.*;
import org.hbrs.se1.ws26.exercises.uebung1.factory.Factory1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GermanTranslatorTest {

    @Test
    public void aTest() {
        GermanTranslator translator = new GermanTranslator();

        assertEquals("null" , translator.translateNumber(0));

        assertEquals("fünf" , translator.translateNumber(5));

        assertEquals("1.0", translator.translateNumber(150));

        assertEquals("null", translator.translateNumber(0));

        assertEquals("vierzig", translator.translateNumber(40));

        assertEquals("eins", translator.translateNumber(1));

        assertEquals("1.0",  translator.translateNumber(101));

        assertEquals("zweimilliardeneinhundertsiebenundvierzigmillionenvierhundertdreiundachtzigtausendsechshundertsiebenundvierzig", translator.translateNumber(Integer.MAX_VALUE));

        assertEquals("1.0",  translator.translateNumber(-1));

        assertEquals("1.0", translator.translateNumber(Integer.MIN_VALUE));
    }

}