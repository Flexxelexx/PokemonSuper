import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FirePokemon firePokemon = new FirePokemon("Charmander", 5, 100.12, "Meat", "'Chaaaaar'");
        WaterPokemon waterPokemon = new WaterPokemon("Squirtle", 10, 200, "Fish", "'Squiiiiirtle'");
        GrassPokemon grassPokemon = new GrassPokemon("Bulbasaur", 15, 310, "Grass", "'Buuuuuuulba'");
        ElectricPokemon electricPokemon = new ElectricPokemon("Electrabuzz", 21, 545, "Candy", "'Eelectra'");

        PokemonSuper pokemonSuper = new PokemonSuper();


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


            // Charmander attack

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

            // Charmander eats

            if (chooseActivity.equalsIgnoreCase("eat")) {
                System.out.println("You have chosen to let the Pokemon eat something. You can type in 'a bit' or 'a lot'");
                String chooseAmount = scanner.nextLine();

                if (chooseAmount.equalsIgnoreCase("a lot")) {
                    System.out.println("\nCharmander gathers all his caught food and starts munching big chunks of " + firePokemon.getFood().toLowerCase() + ". It will regenerate 100% of it's HP");
                    firePokemon.setLevel(6);
                    System.out.println(firePokemon.getName() +" has gained 1 level! " + firePokemon.getName() + " is now level " + firePokemon.getLevel() );
                }
                if (chooseAmount.equalsIgnoreCase("a bit")) {
                    System.out.println("\nCharmander empties his pockets and starts eating small bits of " + firePokemon.getFood().toLowerCase() + ". It will regeneratie 25% of it's HP.");
                }
            }

            // Charmander sleeps

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

            // Charmander talks

            if (chooseActivity.equalsIgnoreCase("talk")) {
                    System.out.println("\nWhat have you done? " + firePokemon.getName() + " starts talking and calling its own name; " + firePokemon.getSound());
                }
        }

        // Squirtle question-tree

        if (choosePokemon.equalsIgnoreCase("squirtle")) {
            System.out.println("\nYou have chosen Squirtle to play with");
            System.out.println("\n What do you want to do now? Type in what you want this pokemon to do: \n- Attack \n- Eat \n- Sleep \n- Talk");
            String chooseActivity = scanner.nextLine();

            // Squirtle attacks

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

            // Squirtle eats

            if (chooseActivity.equalsIgnoreCase("eat")) {
                System.out.println("You have chosen to let the Pokemon eat something. You can type in 'a bit' or 'a lot'");
                String chooseAmount = scanner.nextLine();

                if (chooseAmount.equalsIgnoreCase("a lot")) {
                    System.out.println("\nSquirtle gathers all his caught food and starts munching big chunks of " + waterPokemon.getFood().toLowerCase() + ". It will regenerate 100% of it's HP.");
                    waterPokemon.setLevel(11);
                    System.out.println(waterPokemon.getName() +" has gained 1 level! " + waterPokemon.getName() + " is now level " + waterPokemon.getLevel() );
                }
                if (chooseAmount.equalsIgnoreCase("a bit")) {
                    System.out.println("\nSquirtle empties his pockets and starts eating small bits of " + waterPokemon.getFood().toLowerCase() + ". It will regeneratie 25% of it's HP.");
                }
            }

            // Squirtle sleeps

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

            // Squirtle talks

            if (chooseActivity.equalsIgnoreCase("talk")) {
                    System.out.println("\nWhat have you done? " + waterPokemon.getName() + " starts talking and calling its own name; " + waterPokemon.getSound());
                }
        }

        // Bulbasaur question-tree

        if (choosePokemon.equalsIgnoreCase("bulbasaur")) {
            System.out.println("\nYou have chosen Bulbasaur to play with");
            System.out.println("\n What do you want to do now? Type in what you want this pokemon to do: \n- Attack \n- Eat \n- Sleep \n- Talk");
            String chooseActivity = scanner.nextLine();

            // Bulbasaus attack

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

            // Bulbasaur eats

            if (chooseActivity.equalsIgnoreCase("eat")) {
                System.out.println("You have chosen to let the Pokemon eat something. You can type in 'a bit' or 'a lot'");
                String chooseAmount = scanner.nextLine();

                if (chooseAmount.equalsIgnoreCase("a lot")) {
                    System.out.println("\nBulbasaur gathers all his caught food and starts munching big chunks of " + grassPokemon.getFood().toLowerCase() + ". It will regenerate 100% of it's HP.");
                    grassPokemon.setLevel(16);
                    System.out.println(grassPokemon.getName() +" has gained 1 level! " + grassPokemon.getName() + " is now level " + grassPokemon.getLevel() );
                }
                if (chooseAmount.equalsIgnoreCase("a bit")) {
                    System.out.println("\nBulbasaur empties his pockets and starts eating small bits of " + grassPokemon.getFood().toLowerCase() + ". It will regeneratie 25% of it's HP.");
                }
            }

            // Bulbasaur sleeps

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

            // Bulbasaur talks

            if (chooseActivity.equalsIgnoreCase("talk")) {
                    System.out.println("\nWhat have you done? " + grassPokemon.getName() + " starts talking and calling its own name; " + grassPokemon.getSound());
                }
        }

        // Electrabuzz question-tree

        if (choosePokemon.equalsIgnoreCase("electrabuzz")) {
            System.out.println("\nYou have chosen Electrabuzz to play with");
            System.out.println("\nWhat do you want to do now? Type in what you want this pokemon to do: \n- Attack \n- Eat \n- Sleep \n- Talk");
            String chooseActivity = scanner.nextLine();

            // Electrabuzz attacks

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

            // Electrabuzz eats

            if (chooseActivity.equalsIgnoreCase("eat")) {
                System.out.println("You have chosen to let the Pokemon eat something. You can type in 'a bit' or 'a lot'");
                String chooseAmount = scanner.nextLine();

                if (chooseAmount.equalsIgnoreCase("a lot")) {
                    System.out.println("\nElectrabuzz gathers all his caught food and starts munching his " + electricPokemon.getFood().toLowerCase() + ". It will regenerate 100% of it's HP.");
                    electricPokemon.setLevel(22);
                    System.out.println(electricPokemon.getName() +" has gained 1 level! " + electricPokemon.getName() + " is now level " + electricPokemon.getLevel() );
                }
                if (chooseAmount.equalsIgnoreCase("a bit")) {
                    System.out.println("\nElectrabuzz empties his pockets and starts eating small bits of " + electricPokemon.getFood().toLowerCase() + ". It will regeneratie 25% of it's HP.");
                }
            }

            // Electrabuzz sleeps

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

            // Electrabuzz talks

            if (chooseActivity.equalsIgnoreCase("talk")) {
                    System.out.println("\nWhat have you done? " + electricPokemon.getName() + " starts talking and calling its own name; " + electricPokemon.getSound());
                }

        }

    System.out.println("\nThanks for this fun time, untill next time :-)!");
    }
}







