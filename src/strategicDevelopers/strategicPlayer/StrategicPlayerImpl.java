package strategicDevelopers.strategicPlayer;

public class StrategicPlayerImpl implements StrategicPlayer {
   private int currentSpinCount = 0;
   int coinsPerWheel;
   int revealsPerSpin;
   int maxNumSpins;


   /**
    * Default constructor, implements a 4 coin 2 reveal game with
    * no max spins (represented by a maxNumSpins < 0)
    */
   public StrategicPlayerImpl(){
      beginGame(4, 2, -1);
   }
    
   /**
    * Constructor, with variable max spins
    */
   public StrategicPlayerImpl(int maxNumSpins){
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
     if(currentSpinCount%2 == 0){
       return "?-?-";
     }
     else{
       return "??--";
     }
   }

   @Override
   public CharSequence getNewCoinStates(CharSequence revealedPattern) {
      return null;
   }

   /*
    * For testing, increments currentSpinCount
    */
   void incCurrentSpinCount(){currentSpinCount+=1;}

   /**
    * Main class for testing
    */
    public static void main(String[] args){
      StrategicPlayerImpl sp = new StrategicPlayerImpl();
      System.out.println(sp.getSlotsToReveal());
    }
}
