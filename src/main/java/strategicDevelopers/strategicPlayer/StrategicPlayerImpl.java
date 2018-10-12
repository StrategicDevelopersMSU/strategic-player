package strategicDevelopers.strategicPlayer;

public class StrategicPlayerImpl implements StrategicPlayer {
   private int currentSpinCount = 0;
   private int coinsPerWheel;
   private int revealsPerSpin;
   private int maxNumSpins;

   /**
    * Default constructor, implements a 4 coin 2 reveal game with
    * no max spins (represented by a maxNumSpins < 0)
    */
   public void StrategicPlayerImpl(){
      beginGame(4, 2, -1);
   }
    
   /**
    * Constructor, with variable max spins
    */
   public void StrategicPlayerImpl(int maxNumSpins){
      beginGame(4, 2, maxNumSpins);
   }
  
   @Override
   public void beginGame(int coinsPerWheel, int revealsPerSpin, int maxNumSpins) {
      this.coinsPerWheel = coinsPerWheel;
      this.revealsPerSpin = revealsPerSpin;
      this.maxNumSpins = maxNumSpins;
   }

   @Override
   public CharSequence getSlotsToReveal() {
     if(currentSpinCount%2 == 0)
       return "?-?-";
     else
       return "??--";
   }

   @Override
   public CharSequence getNewCoinStates(CharSequence revealedPattern) {
      return null;
   }
}
