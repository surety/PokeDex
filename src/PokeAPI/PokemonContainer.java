// Author: Zeus Polanco
// March 2021

package PokeAPI;

public class PokemonContainerInterface implements PokemonContainerInterface{

  Pokemon[] pokemonContainer = new Pokemon[0];

  public void setPokemon( Pokemon[] pokemon){}
  public Pokemon getPokemon( int id ){return null;}
  public Pokemon[] getAllPokemon(){return null;}

}
