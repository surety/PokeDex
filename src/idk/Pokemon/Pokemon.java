
// Author: Zeus
// March 2021

package Pokemon;

class Pokemon implements PokemonInterface {

  private int NATIONAL_NUM, GENERATION;
  private String NAME, TYPE;
  private LinkedList<Entry> ENTRIES;

  public Pokemon(){}

  // Accessors and getters
  public getNationalNumber(){ return this.NATIONAL_NUM; }
  public getName(){ return this.NAME; }
  public getType(){ return this.TYPE; }
  public getGeneration(){ return this.GENERATION; }
  public getEntries(){ return this.ENTRIES; }

}
