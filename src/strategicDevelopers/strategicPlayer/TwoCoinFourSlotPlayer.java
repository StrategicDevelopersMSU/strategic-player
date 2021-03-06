package strategicDevelopers.strategicPlayer;

import java.util.HashMap;
import java.util.Map;

public class TwoCoinFourSlotPlayer implements StrategicPlayer {
   private static final char HEADS_COIN_STATE = 'H';
   private static final char TAILS_COIN_STATE = 'T';

   private int currentSpinCount = 0;
   private int coinsPerWheel;
   private int revealsPerSpin;
   private int maxNumSpins;
   private char desiredEndCoinState;

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
      if(currentSpinCount % 2 == 0)
         return "?-?-";
      else
         return "??--";
   }

   @Override
   public CharSequence getNewCoinStates(CharSequence revealedPattern) {
      Map<String, Integer> numberOfCoinOccurences = getNumberOfCoinOccurrencesInPattern(revealedPattern);

      if(currentSpinCount <= 1)
      {
          setDesiredEndCoinState(numberOfCoinOccurences);
      }

      CharSequence strategicCoinPattern = replaceQuestionMarkWithDesiredCoinState(revealedPattern);

      return strategicCoinPattern;
   }

   private CharSequence replaceQuestionMarkWithDesiredCoinState(CharSequence revealedPattern)
   {
      StringBuilder stringBuilder = new StringBuilder();

      for(int i = 0; i < revealedPattern.length(); i++)
      {
         char currentChar = revealedPattern.charAt(i);
         if(currentChar != ' ' && currentChar != '-' && currentChar != desiredEndCoinState )
         {
            stringBuilder.append(desiredEndCoinState);
         }
         else
         {
            stringBuilder.append(currentChar);
         }
      }

      return stringBuilder.toString();
   }

   private Map<String,Integer> getNumberOfCoinOccurrencesInPattern(CharSequence revealedPattern) {
      int numOfHeads = 0;
      int numOfTails = 0;
      Map<String, Integer> coinOccurences = new HashMap<String, Integer>();

      for(int i =0; i < revealedPattern.length(); i++)
      {
         char c = revealedPattern.charAt(i);
         if(c == HEADS_COIN_STATE)
         {
            numOfHeads++;
         }
         if(c == TAILS_COIN_STATE)
         {
            numOfTails++;
         }
      }

      coinOccurences.put("numOfHeads", numOfHeads);
      coinOccurences.put("numOfTails", numOfTails);

      return coinOccurences;
   }

   //If we get 2 of either on the first reveal and the game isnt over, we flip them both
   //because at worst 3/4 coins are now that state, at best 4/4 are now in that state and
   //the game is over.
   private void setDesiredEndCoinState(Map<String, Integer> coinOccurrences)
   {
      int numOfHeadsInPattern = coinOccurrences.get("numOfHeads");
      int numOfTailsInPattern = coinOccurrences.get("numOfTails");

      if(currentSpinCount <= 1)
      {
         if(numOfHeadsInPattern == 2)
         {
            desiredEndCoinState = 'T';
         }
         else if(numOfTailsInPattern == 2)
         {
            desiredEndCoinState = 'H';
         }
         else{
             desiredEndCoinState = 'H';
         }
      }
   }

   /*
 * For testing, increments currentSpinCount
 */
   void incCurrentSpinCount(){currentSpinCount+=1;}

   public int getCoinsPerWheel() {
      return coinsPerWheel;
   }

   public int getRevealsPerSpin() {
      return revealsPerSpin;
   }

   public int getMaxNumSpins() {
      return maxNumSpins;
   }
   
   public static void main(String [] args){
   
   }
}
