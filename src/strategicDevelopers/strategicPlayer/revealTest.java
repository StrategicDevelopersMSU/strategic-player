package strategicDevelopers.strategicPlayer;
import org.junit.Test;
import static org.junit.Assert.*;

public class revealTest {
  final static String reveal0 = "?-?-";
  final static String reveal1 = "??--";
  @Test
  public void revealTest0(){
    StrategicPlayerImpl stratplay = new StrategicPlayerImpl();
    assertTrue(stratplay.getSlotsToReveal().equals(reveal0));
    stratplay.incCurrentSpinCount();
    assertTrue(stratplay.getSlotsToReveal().equals(reveal1));
  }
}
