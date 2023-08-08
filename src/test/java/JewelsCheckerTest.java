import org.jewelschecker.JewelsChecker;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class JewelsCheckerTest {
    @Test
    public void testJewelsChecker() throws IOException {
        assertEquals(3, JewelsChecker.checker("aAAbbbb", "aA"));
        assertEquals(0, JewelsChecker.checker("ZZ", "z"));
        assertThrows(IOException.class, () -> JewelsChecker.checker("", "f"));
        assertThrows(IOException.class, () -> JewelsChecker.checker("fgdfgggggggggggfdfgdfgdfgdfgdfgdfgdfgdfgdfgdfgdfgdfgdfgdfgdfgdfgdfgdfg", "aA"));
    }
}
