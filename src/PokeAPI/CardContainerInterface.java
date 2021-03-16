
// Author: Zeus Polanco
// Editors: Danica
// March 2021

package PokeAPI;

interface CardContainerInterface{

  public void addCard( Card card);
  public void removeCard( Card card );
  public Card getCard( int id );
  public Card[] getAllCards();

  // TODO get cards of specific parameters.
}
