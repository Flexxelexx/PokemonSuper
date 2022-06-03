public class ElectricPokemon extends PokemonSuper {

    private String name;
    private int level;
    private double hp;
    private String food;
    private String sound;
    private String attack;


    public ElectricPokemon() {

    }

    public ElectricPokemon (String name, int level, double hp, String food, String sound) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public ElectricPokemonAttack (String attack) {
        this.attack = attack;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public void thunderPunch() {
        System.out.println("attacks with thunderpunch");
    }
    public void electroBall() {
        System.out.println("attacks with electroball");
    }
    public void thunder() {
        System.out.println("attacks with thunder");
    }
    public void voltTackle() {
        System.out.println("attacks with volttackle");
    }

}
