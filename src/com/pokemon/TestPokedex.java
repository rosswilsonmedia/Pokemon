package com.pokemon;

public class TestPokedex {

	public static void main(String[] args) {
		Pokedex timmy = new Pokedex();
		Pokemon mamoswine = timmy.createPokemon("Mamoswine", 100, "ground and ice");
		Pokemon necrozma = timmy.createPokemon("Necrozma", 100, "psyhic");
		mamoswine.attackPokemon(necrozma);
		timmy.listPokemon();
	}

}
