package org.hbrs.se1.ws26.exercises.uebung1.factory;

import org.hbrs.se1.ws26.exercises.uebung1.control.GermanTranslator;
import org.hbrs.se1.ws26.exercises.uebung1.control.Translator;

public class Factory1 {
    public static Translator createTranslator(){
        GermanTranslator tr = new GermanTranslator();
        tr.setDate("01.10.2026");
        Translator translator = tr;

        return translator;
    }

}
