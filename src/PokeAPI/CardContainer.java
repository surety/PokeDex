
// Author: Zeus Polanco
// Editors: Danica
// Handles card structes

package PokeAPI;

class CardContainer implements CardContainer{
  private LinkedList<Card> cards;

  public CardContainer(LinkedList<Card> cards){
    this.cards == cards;
  }

  public void addCard( Card card ){
    this.cards.add(card);
  }
  public void removeCad( Card card ){
    // TODO remove cards
  }
  public Card getCard( int id ){
    // TODO get cards by id
  }
  public Card[] getAllCards(){
    // TODO return cards as array
  }


}
