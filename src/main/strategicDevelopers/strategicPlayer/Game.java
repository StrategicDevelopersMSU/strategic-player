public class Game {
  
  private boolean coins[];
  private int numCoins;
  private int numSpins;
  private int maxSpins;

  public Game(int numCoins, int numSpins, int maxSpins) {
    this.numCoins = numCoins;
    this.numSpins = numSpins;
    this.maxSpins = maxSpins;
    coins = new boolean[numCoins];
  }

  public void setNumCoins(int numCoins) {
    this.numCoins = numCoins;
  }

  public int getNumCoins() {
    return numCoins;
  }

  public void setNumSpins(int numSpins) {
    this.numSpins = numSpins;
  }

  public int getNumSpins() {
    return numSpins;
  }

  public void setMaxSpins(int maxSpins) {
    this.maxSpins = maxSpins;
  }

  public int getMaxSpins() {
    return maxSpins;
  }

}
