import junit.framework.TestCase;
import org.junit.Test;

import java.strategicDevelopers.strategicPlayer.StrategicPlayerImpl;

public class StrategicPlayerTest extends TestCase {

    @Test
    public void testBeginGame()
    {
        StrategicPlayerImpl strategicPlayer = new StrategicPlayerImpl();
        strategicPlayer.beginGame();
    }
}
