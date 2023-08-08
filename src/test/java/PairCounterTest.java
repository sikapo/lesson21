import org.GoodPairs.PairCounter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PairCounterTest {
    @Test
        public void testPairCounter(){
        assertEquals(4, PairCounter.pairCounter(new int[]{1, 2, 3, 1, 1, 3}));
        assertEquals(6, PairCounter.pairCounter(new int[]{1,1,1,1}));
        assertEquals(0, PairCounter.pairCounter(new int[]{1,2,3}));
        assertEquals(3, PairCounter.pairCounter(new int[]{1, 2, 3, 1, 1, }));
        assertEquals(0, PairCounter.pairCounter(new int[]{10, 2, 7, 1, 8, 3}));

    }
}
