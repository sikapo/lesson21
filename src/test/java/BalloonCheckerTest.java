import org.Baloons.BalloonChecker;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BalloonCheckerTest {
    @Test
    public void testBalloonChecker() {
        assertEquals(1, BalloonChecker.balloonChecker("baaaaaalllllllooooonn"));

        assertEquals(1, BalloonChecker.balloonChecker("nlaebolko"));

        assertEquals(0, BalloonChecker.balloonChecker("ballo"));

        assertEquals(2, BalloonChecker.balloonChecker("loonbalxballpoon"));

        assertEquals(0, BalloonChecker.balloonChecker("leetcode"));

        assertEquals(0, BalloonChecker.balloonChecker("llll"));
    }
}
