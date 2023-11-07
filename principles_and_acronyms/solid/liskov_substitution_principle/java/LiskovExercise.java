package principles_and_acronyms.solid.liskov_substitution_principle.java;

class Pokemon {
    private String name;
    private String type;

    public Pokemon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
    // Constructor, getters y setters
}

interface Attacker {
    void attack();
}

interface Healer {
    void heal();
}

interface Flyer {
    void fly();
}

interface Swimmer {
    void swim();
}

class Pikachu extends Pokemon implements Attacker {
    public Pikachu() {
        super("Pikachu");
    }
    public void attack() {
        System.out.println("Pikachu usa Impactrueno!");
    }
}

class Pokeball {
    public boolean catchPokemon(Pokemon pokemon) {
        System.out.println("Intentas atrapar a " + pokemon.getName());
        // Implementación básica para atrapar Pokémon
        return true;
    }
}

class GreatBall extends Pokeball {
    @Override
    public boolean catchPokemon(Pokemon pokemon) {
        System.out.println(pokemon.getName() + " fue atrapado con una GreatBall!");
        return true;
    }
}

class UltraBall extends Pokeball {
    @Override
    public boolean catchPokemon(Pokemon pokemon) {
        System.out.println(pokemon.getName() + " fue atrapado con una UltraBall!");
        return true;
    }
}

class LaunchLiskovExample {
    public static void main(String[] args) {
        Pokeball pokeball1 = new GreatBall();
        Pokeball pokeball2 = new UltraBall();

        Pokemon pokemon1 = new Pikachu();

        pokeball1.catchPokemon(pokemon1);
        pokeball2.catchPokemon(pokemon1);

    }
}