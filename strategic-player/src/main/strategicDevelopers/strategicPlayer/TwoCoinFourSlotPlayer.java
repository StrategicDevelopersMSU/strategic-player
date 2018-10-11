package strategicDevelopers.strategicPlayer;

public class TwoCoinFourSlotPlayer implements StrategicPlayer {
   private int currentSpinCount = 0;
   private int coinsPerWheel;
   private int revealsPerSpin;
   private int maxNumSpins;
   private String desiredEndCoinState;

   @Override
   public void beginGame(int coinsPerWheel, int revealsPerSpin, int maxNumSpins) {
      this.coinsPerWheel = coinsPerWheel;
      this.revealsPerSpin = revealsPerSpin;
      this.maxNumSpins = maxNumSpins;
   }

   @Override
   public CharSequence getSlotsToReveal() {

      return null;
   }

   @Override
   public CharSequence getNewCoinStates(CharSequence revealedPattern) {
      return null;
   }

   public int getCoinsPerWheel() {
      return coinsPerWheel;
   }

   public int getRevealsPerSpin() {
      return revealsPerSpin;
   }

   public int getMaxNumSpins() {
      return maxNumSpins;
   }
}
