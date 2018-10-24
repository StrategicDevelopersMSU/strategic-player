package strategicDevelopers.strategicPlayer;


import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class revealTests {
  final String reveal0 = "?-?-";
  final String reveal1 = "??--";
  @Test
  public void revealTest(){
    TwoCoinFourSlotPlayer stratplay = new TwoCoinFourSlotPlayer();
    assertTrue(stratplay.getSlotsToReveal().equals(reveal0));
    stratplay.incCurrentSpinCount();
    assertTrue(stratplay.getSlotsToReveal().equals(reveal1));
  }
}
