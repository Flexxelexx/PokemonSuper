public class Main {
    public static void main(String[] args) {

        FirePokemon firePokemon = new FirePokemon("Charmander", 5, 100.12, "Meat", "'Chaaaaar'");
        WaterPokemon waterPokemon = new WaterPokemon("Squirtle", 10, 200, "Fish", "'Squiiiiirtle'");
        GrassPokemon grassPokemon = new GrassPokemon("Bulbasaur", 15, 310, "Grass", "'Buuuuuuulba'");
        ElectricPokemon electricPokemon = new ElectricPokemon("Electrabuzz", 21, 545, "Candy", "'Eelectra'");

        System.out.println(firePokemon.getName());
        firePokemon.inferno();
        firePokemon.fireLash();
        firePokemon.flamethrower();
        firePokemon.pyroball();


        // Welkom
        System.out.println("***** POKEMON LIST *****");

        // Fire
        System.out.println("\n#####################");
        System.out.println("# - Name: " + firePokemon.getName().toUpperCase() + "\n# - Level: " + firePokemon.getLevel() + "\n# - HP: " + firePokemon.getHp() + "\n# - Food: " + firePokemon.getFood() + "\n# - Sound: " + firePokemon.getSound());
        System.out.println("#####################");

        // Water
        System.out.println("\n#####################");
        System.out.println("# - Name: " + waterPokemon.getName().toUpperCase() + "\n# - Level: " + waterPokemon.getLevel() + "\n# - HP: " + waterPokemon.getHp() + "\n# - Food: " + waterPokemon.getFood() + "\n# - Sound: " + waterPokemon.getSound());
        System.out.println("#####################");

        // Grass
        System.out.println("\n#####################");
        System.out.println("# - Name: " + grassPokemon.getName().toUpperCase() + "\n# - Level: " + grassPokemon.getLevel() + "\n# - HP: " + grassPokemon.getHp() + "\n# - Food: " + grassPokemon.getFood() + "\n# - Sound: " + grassPokemon.getSound());
        System.out.println("#####################");

        // Electric
        System.out.println("\n#####################");
        System.out.println("# - Name: " + electricPokemon.getName().toUpperCase() + "\n# - Level: " + electricPokemon.getLevel() + "\n# - HP: " + electricPokemon.getHp() + "\n# - Food: " + electricPokemon.getFood() + "\n# - Sound: " + electricPokemon.getSound());
        System.out.println("#####################");

    }

}