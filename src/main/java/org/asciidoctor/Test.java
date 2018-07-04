package org.asciidoctor;

import org.asciidoctor.internal.*;

import java.util.*;

/**
 * @author John Ericksen
 */
public class Test {

    public static void main(String[] args) {
        Asciidoctor asciidoctor = JRubyAsciidoctor.create();

        int i = 0;
        try {
            for (; i < 1000; i++) {
                asciidoctor.render("Test", new HashMap<String, Object>());
            }
        } catch (Exception e) {
            System.out.println("Errored after " + i + " iterations.");
            e.printStackTrace();
        }
    }
}
