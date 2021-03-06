package strategicDevelopers.strategicPlayer;

import org.junit.Test;



public class TwoCoinFourSlotPlayerTest {

   private static int COINS_PER_WHEEL = 12;
   private static int REVEALS_PER_SPIN = 13;
   private static int MAX_NUM_SPINS = 14;

   @Test
   public void testBeginGame()
   {
      TwoCoinFourSlotPlayer strategicPlayer = new TwoCoinFourSlotPlayer();

      strategicPlayer.beginGame(COINS_PER_WHEEL, REVEALS_PER_SPIN, MAX_NUM_SPINS);

      assert strategicPlayer.getMaxNumSpins() == MAX_NUM_SPINS;
      assert strategicPlayer.getCoinsPerWheel() == COINS_PER_WHEEL;
      assert strategicPlayer.getRevealsPerSpin() == REVEALS_PER_SPIN;
   }

   @Test
   public void testNewCoinStatesWithTwoHeads()
   {
      TwoCoinFourSlotPlayer strategicPlayer = new TwoCoinFourSlotPlayer();
      CharSequence newCoinStates = strategicPlayer.getNewCoinStates("H H - -");
      CharSequence expectedState = "T T - -";

      assert newCoinStates.equals(expectedState);

   }

   @Test
   public void testNewCoinStatesWithTwoTails()
   {
      TwoCoinFourSlotPlayer strategicPlayer = new TwoCoinFourSlotPlayer();
      CharSequence newCoinStates = strategicPlayer.getNewCoinStates("T T - -");
      CharSequence expectedState = "H H - -";

      assert newCoinStates.equals(expectedState);

   }

   @Test
   public void testNewCoinStatesWithDifferentStates()
   {
      TwoCoinFourSlotPlayer strategicPlayer = new TwoCoinFourSlotPlayer();
      CharSequence newCoinStates = strategicPlayer.getNewCoinStates("H T - -");
      CharSequence expectedState = "H H - -";

      assert newCoinStates.equals(expectedState);

   }
}
