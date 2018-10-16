package strategicDevelopers.strategicPlayer;
import org.junit.Test;
import static org.junit.Assert.*;

public class revealTests {
  final String reveal0 = "?-?-";
  final String reveal1 = "??--";
  @Test
  public void revealTest(){
    StrategicPlayerImpl stratplay = new StrategicPlayerImpl();
    assertTrue(stratplay.getSlotsToReveal().equals(reveal0));
    stratplay.incCurrentSpinCount();
    assertTrue(stratplay.getSlotsToReveal().equals(reveal1));
  }
}
