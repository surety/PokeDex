
// Author: Zeus
// March 2021

package Pokemon;

class Pokemon implements PokemonInterface {

  private int NATIONAL_NUM, GENERATION;
  private String NAME, TYPE;
  private LinkedList<Entry> ENTRIES;

  public Pokemon(){}

  // Accessors and getters
  public getNationalNumber(){ return this.nationalNum; }
  public getName(){ return this.name; }
  public getType(){ return this.type; }
  public getGeneration(){ return this.region; }
  public getEntries(){ return this.entries; }

}
