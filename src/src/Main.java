import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FirePokemon firePokemon = new FirePokemon("Charmander", 5, 100.12, "Meat", "'Chaaaaar'");
        WaterPokemon waterPokemon = new WaterPokemon("Squirtle", 10, 200, "Fish", "'Squiiiiirtle'");
        GrassPokemon grassPokemon = new GrassPokemon("Bulbasaur", 15, 310, "Grass", "'Buuuuuuulba'");
        ElectricPokemon electricPokemon = new ElectricPokemon("Electrabuzz", 21, 545, "Candy", "'Eelectra'");

        // Welcome
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

        // Questions

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWhich Pokemon you want to play with?");
        String choosePokemon = scanner.nextLine();

        // Charmander question-tree

        if (choosePokemon.equalsIgnoreCase("Charmander")) {
            System.out.println("\nYou have chosen Charmander to play with!");
            System.out.println("\n What do you want to do now? Type in what you want this pokemon to do: \n- Attack \n- Eat \n- Sleep \n- Talk");
            String chooseActivity = scanner.nextLine();


            if (chooseActivity.equalsIgnoreCase("attack")) {
                System.out.println("You can choose 4 attacks for this pokemon! Type in which one you want to attack with: \n- Inferno\n- Pyroball\n- Firelash\n- Flamethrower");
                String chooseAttack = scanner.nextLine();

                if (chooseAttack.equalsIgnoreCase("inferno")) {
                    firePokemon.inferno();
                }
                if (chooseAttack.equalsIgnoreCase("Pyroball")) {
                    firePokemon.pyroball();
                }
                if (chooseAttack.equalsIgnoreCase("Firelash")) {
                    firePokemon.fireLash();
                }
                if (chooseAttack.equalsIgnoreCase("Flamethrower")) {
                    firePokemon.flamethrower();
                }
            }
            if (chooseActivity.equalsIgnoreCase("eat")) {
                System.out.println("You have chosen to let the Pokemon eat something. You can type in 'a bit' or 'a lot'");
                String chooseAmount = scanner.nextLine();

                if (chooseAmount.equalsIgnoreCase("a lot")) {
                    System.out.println("\nCharmander gathers all his caught food and starts munching. It will regenerate 100% of it's HP.");
                }
                if (chooseAmount.equalsIgnoreCase("a bit")) {
                    System.out.println("\nCharmander empties his pockets and starts eating small bits. It will regeneratie 25% of it's HP.");
                }
            }
            if (chooseActivity.equalsIgnoreCase("Sleep")) {
                System.out.println("You have chosen to let the Pokemon sleep. You can type in 'a bit' or 'a lot'");
                String chooseAmount = scanner.nextLine();

                if (chooseAmount.equalsIgnoreCase("a lot")) {
                    System.out.println("\nCharmander tucks itself in for a nights sleep. It will be fully rested and ready for battle!");
                }
                if (chooseAmount.equalsIgnoreCase("a bit")) {
                    System.out.println("\nCharmander lays down on the floor for a quick nap. It will be ready to fight one extra battle!");
                }
            }

            if (chooseActivity.equalsIgnoreCase("talk")) {
                    System.out.println("\nWhat have you done? Charmander starts talking and calling its own name; 'Chaaaaaaaaaarrrrr'");
                }
        }

        // Squirtle question-tree

        if (choosePokemon.equalsIgnoreCase("squirtle")) {
            System.out.println("\nYou have chosen Squirtle to play with");
            System.out.println("\n What do you want to do now? Type in what you want this pokemon to do: \n- Attack \n- Eat \n- Sleep \n- Talk");
            String chooseActivity = scanner.nextLine();

            if (chooseActivity.equalsIgnoreCase("attack")) {
                System.out.println("You can choose 4 attacks for this pokemon! Type in which one you want to attack with: \n- Surf\n- Hydropump\n- Hydrocanon\n- Raindance");
                String chooseAttack = scanner.nextLine();

                if (chooseAttack.equalsIgnoreCase("surf")) {
                    waterPokemon.surf();
                }
                if (chooseAttack.equalsIgnoreCase("hydropump")) {
                    waterPokemon.hydroPump();
                }
                if (chooseAttack.equalsIgnoreCase("hydrocanon")) {
                    waterPokemon.hydroCanon();
                }
                if (chooseAttack.equalsIgnoreCase("raindance")) {
                    waterPokemon.rainDance();
                }
            }
            if (chooseActivity.equalsIgnoreCase("eat")) {
                System.out.println("You have chosen to let the Pokemon eat something. You can type in 'a bit' or 'a lot'");
                String chooseAmount = scanner.nextLine();

                if (chooseAmount.equalsIgnoreCase("a lot")) {
                    System.out.println("\nSquirtle gathers all his caught food and starts munching. It will regenerate 100% of it's HP.");
                }
                if (chooseAmount.equalsIgnoreCase("a bit")) {
                    System.out.println("\nSquirtle empties his pockets and starts eating small bits. It will regeneratie 25% of it's HP.");
                }
            }

            if (chooseActivity.equalsIgnoreCase("Sleep")) {
                System.out.println("You have chosen to let the Pokemon sleep. You can type in 'a bit' or 'a lot'");
                String chooseAmount = scanner.nextLine();

                if (chooseAmount.equalsIgnoreCase("a lot")) {
                    System.out.println("\nSquirtle tucks itself in for a nights sleep. It will be fully rested and ready for battle!");
                }
                if (chooseAmount.equalsIgnoreCase("a bit")) {
                    System.out.println("\nSquirtle lays down on the floor for a quick nap. It will be ready to fight one extra battle!");
                }
            }

            if (chooseActivity.equalsIgnoreCase("talk")) {
                    System.out.println("\nWhat have you done? Squirtle starts talking and calling its own name; 'Squiiiiiiiirtle'");
                }
        }

        // Bulbasaur question-tree

        if (choosePokemon.equalsIgnoreCase("bulbasaur")) {
            System.out.println("\nYou have chosen Bulbasaur to play with");
            System.out.println("\n What do you want to do now? Type in what you want this pokemon to do: \n- Attack \n- Eat \n- Sleep \n- Talk");
            String chooseActivity = scanner.nextLine();

            if (chooseActivity.equalsIgnoreCase("attack")) {
                System.out.println("You can choose 4 attacks for this pokemon! Type in which one you want to attack with: \n- Leafstorm\n- Solarbeam\n- Leechseed\n- Leafblade");
                String chooseAttack = scanner.nextLine();

                if (chooseAttack.equalsIgnoreCase("leafstorm")) {
                    grassPokemon.leafStorm();
                }
                if (chooseAttack.equalsIgnoreCase("solarbeam")) {
                    grassPokemon.solarBeam();
                }
                if (chooseAttack.equalsIgnoreCase("leechseed")) {
                    grassPokemon.leechSeed();
                }
                if (chooseAttack.equalsIgnoreCase("leafblade")) {
                    grassPokemon.leafBlade();
                }

            }

            if (chooseActivity.equalsIgnoreCase("eat")) {
                System.out.println("You have chosen to let the Pokemon eat something. You can type in 'a bit' or 'a lot'");
                String chooseAmount = scanner.nextLine();

                if (chooseAmount.equalsIgnoreCase("a lot")) {
                    System.out.println("\nBulbasaur gathers all his caught food and starts munching. It will regenerate 100% of it's HP.");
                }
                if (chooseAmount.equalsIgnoreCase("a bit")) {
                    System.out.println("\nBulbasaur empties his pockets and starts eating small bits. It will regeneratie 25% of it's HP.");
                }
            }

            if (chooseActivity.equalsIgnoreCase("Sleep")) {
                System.out.println("You have chosen to let the Pokemon sleep. You can type in 'a bit' or 'a lot'");
                String chooseAmount = scanner.nextLine();

                if (chooseAmount.equalsIgnoreCase("a lot")) {
                    System.out.println("\nBulbasaur tucks itself in for a nights sleep. It will be fully rested and ready for battle!");
                }
                if (chooseAmount.equalsIgnoreCase("a bit")) {
                    System.out.println("\nBulbasaur lays down on the floor for a quick nap. It will be ready to fight one extra battle!");
                }
            }
            if (chooseActivity.equalsIgnoreCase("talk")) {
                    System.out.println("\nWhat have you done? Bulbasaur starts talking and calling its own name; 'Bulbaaaaaasaur'");
                }
        }

        // Electrabuzz question-tree

        if (choosePokemon.equalsIgnoreCase("electrabuzz")) {
            System.out.println("\nYou have chosen Electrabuzz to play with");
            System.out.println("\nWhat do you want to do now? Type in what you want this pokemon to do: \n- Attack \n- Eat \n- Sleep \n- Talk");
            String chooseActivity = scanner.nextLine();

            if (chooseActivity.equalsIgnoreCase("attack")) {
                System.out.println("You can choose 4 attacks for this pokemon! Type in which one you want to attack with: \n- Thunderpunch\n- Electroball\n- Thunder\n- Volttackle");
                String chooseAttack = scanner.nextLine();

                if (chooseAttack.equalsIgnoreCase("thunderpunch")) {
                    electricPokemon.thunderPunch();
                }
                if (chooseAttack.equalsIgnoreCase("electroball")) {
                    electricPokemon.electroBall();
                }
                if (chooseAttack.equalsIgnoreCase("thunder")) {
                    electricPokemon.thunder();
                }
                if (chooseAttack.equalsIgnoreCase("volttackle")) {
                    electricPokemon.voltTackle();
                }
            }

            if (chooseActivity.equalsIgnoreCase("eat")) {
                System.out.println("You have chosen to let the Pokemon eat something. You can type in 'a bit' or 'a lot'");
                String chooseAmount = scanner.nextLine();

                if (chooseAmount.equalsIgnoreCase("a lot")) {
                    System.out.println("\nElectrabuzz gathers all his caught food and starts munching. It will regenerate 100% of it's HP.");
                }
                if (chooseAmount.equalsIgnoreCase("a bit")) {
                    System.out.println("\nElectrabuzz empties his pockets and starts eating small bits. It will regeneratie 25% of it's HP.");
                }
            }

            if (chooseActivity.equalsIgnoreCase("Sleep")) {
                System.out.println("You have chosen to let the Pokemon sleep. You can type in 'a bit' or 'a lot'");
                String chooseAmount = scanner.nextLine();

                if (chooseAmount.equalsIgnoreCase("a lot")) {
                    System.out.println("\nElectrabuzz tucks itself in for a nights sleep. It will be fully rested and ready for battle!");
                }
                if (chooseAmount.equalsIgnoreCase("a bit")) {
                    System.out.println("\nElectrabuzz lays down on the floor for a quick nap. It will be ready to fight one extra battle!");
                }
            }

            if (chooseActivity.equalsIgnoreCase("talk")) {
                    System.out.println("\nWhat have you done? Electrabuzz starts talking and calling its own name; 'EleeeeeectraaaaaBUZZZZ'");
                }

        }

    System.out.println("\nThanks for this fun time, untill next time :-)!");
    }
}







