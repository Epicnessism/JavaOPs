public class Bottle {
  public int bottle_capa;
  public int bottle_lvl;
  
  public Bottle (int capacity) {
    bottle_capa = capacity;
    bottle_lvl = 0;
  }
  public Bottle() {
    bottle_capa = 20;
    bottle_lvl = 0;
  }
  public int currentLevel() {
    return this.bottle_lvl;
  }
  public void add (int numOunces) {
    for(int i = bottle_lvl; i < numOunces && i < bottle_capa; i++) {
      bottle_lvl++;
    }
  }
  public int pour (int amount) {
    int i;
    for (i = 0; i < amount && bottle_lvl >= 0; i++) {
      if (bottle_lvl <= 0) {
        break;
      }
      bottle_lvl--;
    }
    return i;
  }
  public static int combinedOunces (Bottle[] bottles) {
    int ans = 0;
    for (int i = 0; i < bottles.length; i++) { //cycles through each bottle object and gets current level
      ans += bottles[i].currentLevel();
    }
    return ans;
  }
}