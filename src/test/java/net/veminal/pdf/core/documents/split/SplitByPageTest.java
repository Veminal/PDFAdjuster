package net.veminal.pdf.core.documents.split;

import org.junit.Test;

/**
 * Split PDF by page.
 *
 * @author Veminal
 * @version 1.0
 */
public class SplitByPageTest {

    @Test
    public void splitTest() {
        final String input = "C:\\users\\user\\desktop\\test.pdf";
        final String output = "C:\\users\\user\\desktop\\test\\";
        final String name = "Example";
        ISplit split = new SplitByPage(input, output, name);
        split.extract();
        assert true;
    }
}
