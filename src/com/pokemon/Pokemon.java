package com.pokemon;

public class Pokemon {
	private String name;
	private int health;
	private String type;
	private static int pokemonCount=0;
	
	public Pokemon(String name, int health, String type) {
		this.setName(name);
		this.setHealth(health);
		this.setType(type);
		setPokemonCount(getPokemonCount() + 1);
	}
	
	public void attackPokemon(Pokemon pokemon) {
		pokemon.setHealth(pokemon.getHealth() - 10);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public static int getPokemonCount() {
		return pokemonCount;
	}

	public static void setPokemonCount(int pokemonCount) {
		Pokemon.pokemonCount = pokemonCount;
	}
	
	
}
