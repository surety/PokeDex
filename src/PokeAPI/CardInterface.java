
// Author: Zeus Polanco
// March 2021

package PokeAPI;

// Interface (package-private) providing the specifications for the Pokemon class.
interface Card extends Comparable<Card> {

  // Accessors and getters
  public int getId();
  public int getHP();
  public int dateLogged();
  public String getType();
  public Move[] getMoves();
  public Pokemon setPokemon();

}
