import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FirePokemon firePokemon = new FirePokemon("Charmander", 5, 100.12, "Meat", "'Chaaaaar'");
        WaterPokemon waterPokemon = new WaterPokemon("Squirtle", 10, 200, "Fish", "'Squiiiiirtle'");
        GrassPokemon grassPokemon = new GrassPokemon("Bulbasaur", 15, 310, "Grass", "'Buuuuuuulba'");
        ElectricPokemon electricPokemon = new ElectricPokemon("Electrabuzz", 21, 545, "Candy", "'Eelectra'");

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


        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWhich Pokemon you want to play with?");
        String choosePokemon = scanner.nextLine();

        if (choosePokemon.equalsIgnoreCase("Charmander")) {
            System.out.println("\nYou have chosen Charmander to play with");
            System.out.println("You can choose 4 attacks for this pokemon! Type in which one you want to attack with: \n1) Inferno\n2) Pyroball\n3) Firelash\n4) Flamethrower");
            String chooseAttack = scanner.nextLine();

            if (chooseAttack.equalsIgnoreCase("inferno")) {
                firePokemon.inferno();
            } if (chooseAttack.equalsIgnoreCase("Pyroball")) {
                firePokemon.pyroball();
            } if (chooseAttack.equalsIgnoreCase("Firelash")) {
                firePokemon.fireLash();
            } if (chooseAttack.equalsIgnoreCase("Flamethrower")) {
                firePokemon.flamethrower();
            } else {
                System.out.println("Not a valid input, try again please");
            }
        }
        if (choosePokemon.equalsIgnoreCase("squirtle")) {
            System.out.println("\nYou have chosen Squirtle to play with");
            System.out.println("You can choose 4 attacks for this pokemon! Type in which one you want to attack with: \n1) Surf\n2) Hydropump\n3) Hydrocanon\n4) Raindance");
            String chooseAttack = scanner.nextLine();

            if (chooseAttack.equalsIgnoreCase("surf")) {
                waterPokemon.surf();
            } if (chooseAttack.equalsIgnoreCase("hydropump")) {
                waterPokemon.hydroPump();
            } if (chooseAttack.equalsIgnoreCase("hydrocanon")) {
                waterPokemon.hydroCanon();
            } if (chooseAttack.equalsIgnoreCase("raindance")) {
                waterPokemon.rainDance();
            } else {
                System.out.println("Not a valid input, try again please");
            }
        }
        if (choosePokemon.equalsIgnoreCase("bulbasaur")) {
            System.out.println("\nYou have chosen Bulbasaur to play with");
            System.out.println("You can choose 4 attacks for this pokemon! Type in which one you want to attack with: \n1) Leafstorm\n2) Solarbeam\n3) Leechseed\n4) Leafblade");
            String chooseAttack = scanner.nextLine();

            if (chooseAttack.equalsIgnoreCase("leafstorm")) {
                grassPokemon.leafStorm();
            } if (chooseAttack.equalsIgnoreCase("solarbeam")) {
                grassPokemon.solarBeam();
            } if (chooseAttack.equalsIgnoreCase("leechseed")) {
                grassPokemon.leechSeed();
            } if (chooseAttack.equalsIgnoreCase("leafblade")) {
                grassPokemon.leafBlade();
            } else {
                System.out.println("Not a valid input, try again please");
            }
        }
        if (choosePokemon.equalsIgnoreCase("electrabuzz")) {
            System.out.println("\nYou have chosen Electrabuzz to play with");
            System.out.println("You can choose 4 attacks for this pokemon! Type in which one you want to attack with: \n1) Thunderpunch\n2) Electroball\n3) Thunder\n4) Volttackle");
            String chooseAttack = scanner.nextLine();

            if (chooseAttack.equalsIgnoreCase("thunderpunch")) {
                electricPokemon.thunderPunch();
            } if (chooseAttack.equalsIgnoreCase("electroball")) {
                electricPokemon.electroBall();
            } if (chooseAttack.equalsIgnoreCase("thunder")) {
                electricPokemon.thunder();
            } if (chooseAttack.equalsIgnoreCase("volttackle")) {
                electricPokemon.voltTackle();
            } else {
                System.out.println("Not a valid input, try again please");
            }
        }
    }
}