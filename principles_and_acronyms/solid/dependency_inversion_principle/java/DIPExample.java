package principles_and_acronyms.solid.dependency_inversion_principle.java;

interface PokemonSubCombo{
    void miniCombo();
}

interface PokemonAttack extends PokemonSubCombo{
    void execute();
}

class Charmander implements PokemonAttack {
    public void execute() {
        fireballAtack();
    }

    public void miniCombo() {
        fireballAtack();
        wallFireAtack();
    }

    private void fireballAtack() {
        System.out.println("Charmander usa Bola de Fuego!");
    }
    private void wallFireAtack() {
        System.out.println("Charmander usa Muro de Fuego!");
    }
}

class PokemonTrainer {
    private PokemonAttack attackStrategy;

    public PokemonTrainer(PokemonAttack attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    void commandToAttack() {
        attackStrategy.execute();
    }

    void commandToCombo() {
        attackStrategy.miniCombo();
    }
}

class DIPExample {

    public static void main(String[] args) {
        PokemonAttack charmander = new Charmander();
        PokemonTrainer pokemonTrainer = new PokemonTrainer(charmander);
        pokemonTrainer.commandToAttack();
        System.out.println("***************");
        pokemonTrainer.commandToCombo();
    }
}
