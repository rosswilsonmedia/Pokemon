package com.pokemon;

public abstract class AbstractPokemon implements PokemonInterface {
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon pokemon = new Pokemon(name, health, type);
		return pokemon;
	};
	public String pokemonInfo(Pokemon pokemon) {
		String result = "";
		result+=pokemon.getName() + ", ";
		result+=pokemon.getHealth() + " health, ";
		result+=pokemon.getType() + " type";
		return result;
	};
}