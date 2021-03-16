// Author: Zeus Polanco
// March 2021

package PokeAPI;

interface PokemonContainerInterface{

  public void setPokemon( Pokemon[] pokemon);
  public Pokemon getPokemon( int id );
  public Pokemon[] getAllPokemon();

}
