package java.strategicDevelopers.strategicPlayer;

public class StrategicPlayerImpl implements StrategicPlayer {
   private int currentSpinCount = 0;
   private int coinsPerWheel;
   private int revealsPerSpin;
   private int maxNumSpins;

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
}
