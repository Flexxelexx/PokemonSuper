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
        System.out.println("\nWhich Pokemon you want to play with? \nYou can type in the name.");
        String choosePokemon = scanner.nextLine();

        // Charmander question-tree

        if (choosePokemon.equalsIgnoreCase("Charmander")) {
            System.out.println("\nYou have chosen " + firePokemon.getName() + " to play with!");
            System.out.println("\n What do you want to do now? Type in what you want " + firePokemon.getName() + " to do: \n- Attack \n- Eat \n- Sleep \n- Talk \n- Walk \n- Jump");
            String chooseActivity = scanner.nextLine();


            // Charmander attack

            if (chooseActivity.equalsIgnoreCase("attack")) {
                System.out.println("You can choose 4 attacks for " + firePokemon.getName() + "! Type in which one you want to attack with: \n- Inferno\n- Pyroball\n- Firelash\n- Flamethrower");
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
                System.out.println("You have chosen to let " + firePokemon.getName() + " eat something. You can type in 'a bit' or 'a lot'");
                String chooseAmount = scanner.nextLine();

                if (chooseAmount.equalsIgnoreCase("a lot")) {
                    System.out.println("\n" + firePokemon.getName() + " gathers all his caught food and starts munching big chunks of " + firePokemon.getFood().toLowerCase() + ". It will regenerate 100% of it's HP");
                    firePokemon.setLevel(6);
                    firePokemon.setHp(125.9);
                    System.out.println(firePokemon.getName() +" has gained 1 level!\n" + firePokemon.getName() + " is now level " + firePokemon.getLevel() + ".\nHP is increased to " + firePokemon.getHp());
                }
                if (chooseAmount.equalsIgnoreCase("a bit")) {
                    System.out.println("\n" + firePokemon.getName() + " empties his pockets and starts eating small bits of " + firePokemon.getFood().toLowerCase() + ". It will regeneratie 25% of it's HP.");
                }
            }

            // Charmander sleeps

            if (chooseActivity.equalsIgnoreCase("Sleep")) {
                System.out.println("You have chosen to let " + firePokemon.getName() + " sleep. You can type in 'a bit' or 'a lot'");
                String chooseAmount = scanner.nextLine();

                if (chooseAmount.equalsIgnoreCase("a lot")) {
                    System.out.println("\n" + firePokemon.getName() + " tucks itself in for a nights sleep. It will be fully rested and ready for battle!");
                }
                if (chooseAmount.equalsIgnoreCase("a bit")) {
                    System.out.println("\n" + firePokemon.getName() + " lays down on the floor for a quick nap. It will be ready to fight one extra battle!");
                }
            }

            // Charmander talks

            if (chooseActivity.equalsIgnoreCase("talk")) {
                    System.out.println("\nWhat have you done? " + firePokemon.getName() + " starts talking and calling its own name; " + firePokemon.getSound());
                }

            // Charmander walks

            if (chooseActivity.equalsIgnoreCase("walk")) {
                System.out.println("You have chosen to walk with " + firePokemon.getName());
                pokemonSuper.setWalk(firePokemon.getName() + " starts walking..");
                System.out.println(pokemonSuper.getWalk());
            }

            // Charmander jumps

            if (chooseActivity.equalsIgnoreCase("jump")) {
                System.out.println("Like a little circus monkey you have ordered " + firePokemon.getName() + " to jump. Here we go: ");
                pokemonSuper.setJump(firePokemon.getName() + " jumps! Jeej :)");
                System.out.println(pokemonSuper.getJump());
            }
        }

        // Squirtle question-tree

        if (choosePokemon.equalsIgnoreCase("squirtle")) {
            System.out.println("\nYou have chosen " + waterPokemon.getName() + " to play with");
            System.out.println("\n What do you want to do now? Type in what you want " + waterPokemon.getName() + " to do: \n- Attack \n- Eat \n- Sleep \n- Talk \n- Walk \n- Jump");
            String chooseActivity = scanner.nextLine();

            // Squirtle attacks

            if (chooseActivity.equalsIgnoreCase("attack")) {
                System.out.println("You can choose 4 attacks for " + waterPokemon.getName() + "! Type in which one you want to attack with: \n- Surf\n- Hydropump\n- Hydrocanon\n- Raindance");
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
                System.out.println("You have chosen to let " + waterPokemon.getName() + " eat something. You can type in 'a bit' or 'a lot'");
                String chooseAmount = scanner.nextLine();

                if (chooseAmount.equalsIgnoreCase("a lot")) {
                    System.out.println("\n" + waterPokemon.getName() + " gathers all his caught food and starts munching big chunks of " + waterPokemon.getFood().toLowerCase() + ". It will regenerate 100% of it's HP");
                    waterPokemon.setLevel(11);
                    waterPokemon.setHp(223.4);
                    System.out.println(waterPokemon.getName() +" has gained 1 level!\n" + waterPokemon.getName() + " is now level " + waterPokemon.getLevel() + ".\nHP is increased to " + waterPokemon.getHp());
                }
                if (chooseAmount.equalsIgnoreCase("a bit")) {
                    System.out.println("\n" + waterPokemon.getName() + " empties his pockets and starts eating small bits of " + waterPokemon.getFood().toLowerCase() + ". It will regeneratie 25% of it's HP.");
                }
            }

            // Squirtle sleeps

            if (chooseActivity.equalsIgnoreCase("Sleep")) {
                System.out.println("You have chosen to let " + waterPokemon.getName() + " sleep. You can type in 'a bit' or 'a lot'");
                String chooseAmount = scanner.nextLine();

                if (chooseAmount.equalsIgnoreCase("a lot")) {
                    System.out.println("\n" + waterPokemon.getName() + " tucks itself in for a nights sleep. It will be fully rested and ready for battle!");
                }
                if (chooseAmount.equalsIgnoreCase("a bit")) {
                    System.out.println("\n" + waterPokemon.getName() + " lays down on the floor for a quick nap. It will be ready to fight one extra battle!");
                }
            }

            // Squirtle talks

            if (chooseActivity.equalsIgnoreCase("talk")) {
                    System.out.println("\nWhat have you done? " + waterPokemon.getName() + " starts talking and calling its own name; " + waterPokemon.getSound());
                }

            // Squirtle walks

            if (chooseActivity.equalsIgnoreCase("walk")) {
                System.out.println("You have chosen to walk with " + waterPokemon.getName());
                pokemonSuper.setWalk(waterPokemon.getName() + " starts walking..");
                System.out.println(pokemonSuper.getWalk());
            }

            // Squirtle jumps

            if (chooseActivity.equalsIgnoreCase("jump")) {
                System.out.println("Like a little circus monkey you have ordered " + waterPokemon.getName() + " to jump. Here we go: ");
                pokemonSuper.setJump(waterPokemon.getName() + " jumps! Jeej :)");
                System.out.println(pokemonSuper.getJump());
            }
        }

        // Bulbasaur question-tree

        if (choosePokemon.equalsIgnoreCase("bulbasaur")) {
            System.out.println("\nYou have chosen " + grassPokemon.getName() + " to play with");
            System.out.println("\n What do you want to do now? Type in what you want " + grassPokemon.getName() + " to do: \n- Attack \n- Eat \n- Sleep \n- Talk \n- Walk \n- Jump");
            String chooseActivity = scanner.nextLine();

            // Bulbasaus attack

            if (chooseActivity.equalsIgnoreCase("attack")) {
                System.out.println("You can choose 4 attacks for " + grassPokemon.getName() + "! Type in which one you want to attack with: \n- Leafstorm \n- Solarbeam \n- Leechseed \n- Leafblade");
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
                System.out.println("You have chosen to let " + grassPokemon.getName() + " eat something. You can type in 'a bit' or 'a lot'");
                String chooseAmount = scanner.nextLine();

                if (chooseAmount.equalsIgnoreCase("a lot")) {
                    System.out.println("\n" + grassPokemon.getName() + " gathers all his caught food and starts munching big chunks of " + grassPokemon.getFood().toLowerCase() + ". It will regenerate 100% of it's HP");
                    grassPokemon.setLevel(16);
                    grassPokemon.setHp(350.1);
                    System.out.println(grassPokemon.getName() +" has gained 1 level!\n" + grassPokemon.getName() + " is now level " + grassPokemon.getLevel() + ".\nHP is increased to " + grassPokemon.getHp());
                }
                if (chooseAmount.equalsIgnoreCase("a bit")) {
                    System.out.println("\n" + grassPokemon.getName() + " empties his pockets and starts eating small bits of " + grassPokemon.getFood().toLowerCase() + ". It will regeneratie 25% of it's HP.");
                }
            }

            // Bulbasaur sleeps

            if (chooseActivity.equalsIgnoreCase("Sleep")) {
                System.out.println("You have chosen to let " + grassPokemon.getName() + " sleep. You can type in 'a bit' or 'a lot'");
                String chooseAmount = scanner.nextLine();

                if (chooseAmount.equalsIgnoreCase("a lot")) {
                    System.out.println("\n" + grassPokemon.getName() + " tucks itself in for a nights sleep. It will be fully rested and ready for battle!");
                }
                if (chooseAmount.equalsIgnoreCase("a bit")) {
                    System.out.println("\n" + grassPokemon.getName() + " lays down on the floor for a quick nap. It will be ready to fight one extra battle!");
                }
            }

            // Bulbasaur talks

            if (chooseActivity.equalsIgnoreCase("talk")) {
                    System.out.println("\nWhat have you done? " + grassPokemon.getName() + " starts talking and calling its own name; " + grassPokemon.getSound());
                }

            // Bulbasaur walks

            if (chooseActivity.equalsIgnoreCase("walk")) {
                System.out.println("You have chosen to walk with " + grassPokemon.getName());
                pokemonSuper.setWalk(grassPokemon.getName() + " starts walking..");
                System.out.println(pokemonSuper.getWalk());
            }

            // Bulbasaur jumps

            if (chooseActivity.equalsIgnoreCase("jump")) {
                System.out.println("Like a little circus monkey you have ordered " + grassPokemon.getName() + " to jump. Here we go: ");
                pokemonSuper.setJump(grassPokemon.getName() + " jumps! Jeej :)");
                System.out.println(pokemonSuper.getJump());
            }
        }

        // Electrabuzz question-tree

        if (choosePokemon.equalsIgnoreCase("electrabuzz")) {
            System.out.println("\nYou have chosen " + electricPokemon.getName() + " to play with");
            System.out.println("\nWhat do you want to do now? Type in what you want " + electricPokemon.getName() + " to do: \n- Attack \n- Eat \n- Sleep \n- Talk \n- Walk \n- Jump");
            String chooseActivity = scanner.nextLine();

            // Electrabuzz attacks

            if (chooseActivity.equalsIgnoreCase("attack")) {
                System.out.println("You can choose 4 attacks for " + electricPokemon.getName() + "! Type in which one you want to attack with: \n- Thunderpunch\n- Electroball\n- Thunder\n- Volttackle");
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
                System.out.println("You have chosen to let " + electricPokemon.getName() + " eat something. You can type in 'a bit' or 'a lot'");
                String chooseAmount = scanner.nextLine();

                if (chooseAmount.equalsIgnoreCase("a lot")) {
                    System.out.println("\n" + electricPokemon.getName() + " gathers all his caught food and starts munching big chunks of " + electricPokemon.getFood().toLowerCase() + ". It will regenerate 100% of it's HP");
                    electricPokemon.setLevel(22);
                    electricPokemon.setHp(601.2);
                    System.out.println(electricPokemon.getName() +" has gained 1 level!\n" + electricPokemon.getName() + " is now level " + electricPokemon.getLevel() + ".\nHP is increased to " + electricPokemon.getHp());
                }
                if (chooseAmount.equalsIgnoreCase("a bit")) {
                    System.out.println("\n" + electricPokemon.getName() + " empties his pockets and starts eating small bits of " + electricPokemon.getFood().toLowerCase() + ". It will regeneratie 25% of it's HP.");
                }
            }

            // Electrabuzz sleeps

            if (chooseActivity.equalsIgnoreCase("Sleep")) {
                System.out.println("You have chosen to let the Pokemon sleep. You can type in 'a bit' or 'a lot'");
                String chooseAmount = scanner.nextLine();

                if (chooseAmount.equalsIgnoreCase("a lot")) {
                    System.out.println("\n" + electricPokemon.getName() + " tucks itself in for a nights sleep. It will be fully rested and ready for battle!");
                }
                if (chooseAmount.equalsIgnoreCase("a bit")) {
                    System.out.println("\n" + electricPokemon.getName() + " lays down on the floor for a quick nap. It will be ready to fight one extra battle!");
                }
            }

            // Electrabuzz talks

            if (chooseActivity.equalsIgnoreCase("talk")) {
                    System.out.println("\nWhat have you done? " + electricPokemon.getName() + " starts talking and calling its own name; " + electricPokemon.getSound());
                }

            // Electrabuzz walks

            if (chooseActivity.equalsIgnoreCase("walk")) {
                System.out.println("You have chosen to walk with " + electricPokemon.getName());
                pokemonSuper.setWalk(electricPokemon.getName() + " starts walking..");
                System.out.println(pokemonSuper.getWalk());
            }

            // Electrabuzz jumps

            if (chooseActivity.equalsIgnoreCase("jump")) {
                System.out.println("Like a little circus monkey you have ordered " + electricPokemon.getName() + " to jump. Here we go: ");
                pokemonSuper.setJump(electricPokemon.getName() + " jumps! Jeej :)");
                System.out.println(pokemonSuper.getJump());
            }

        }

        System.out.println("\nThanks for this fun time, until next time :-)!");
        System.out.println("\nShutting console down now....");
    }
}







