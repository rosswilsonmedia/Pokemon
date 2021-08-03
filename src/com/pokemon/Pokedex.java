package com.pokemon;

import java.util.ArrayList;

public class Pokedex extends AbstractPokemon{
	private static ArrayList<Pokemon> myPokemons = new ArrayList<Pokemon>();
	public void listPokemon() {
		for(Pokemon pokemon: myPokemons) {
			System.out.println(pokemonInfo(pokemon));
		}
	}
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon pokemon = super.createPokemon(name, health, type);
		myPokemons.add(pokemon);
		return pokemon;
	}

}
