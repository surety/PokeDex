
// Author: Zeus Polanco
// March 2021
//
class Card implements CardInterface {

  private hp, dateLogged;
  // card_id is unique to each card in container.
  private String card_id, type;
  private LinkedList<Moves> moves;
  private Pokemon pokemon;

  // Builder
  public Card( String card_id, int dateLogged, int hp, String type, LinkedList<Moves> moves ){
    this.card_id = card_id;
    this.dateLogged = dateLogged;
    this.hp = hp;
    this.type = type;
    this.moves = moves;
  }

  public int compareTo(){return 0;} // TODO

  // Accessors and getters
  public String getId(){ return this.id; }
  public int getHP(){ return this.getHP; }
  public int dateLogged(){ return this.dateLogged; }
  public String getType(){ return this.type; }
  public Move[] getMoves(){ return this.moves; }
  public Pokemon setPokemon(){ return this.pokemon; }

}
