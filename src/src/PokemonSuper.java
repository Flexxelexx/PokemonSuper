public class PokemonSuper {

    private String eat;
    private String speak;
    private String walk;

    public void Eating (String eat) {
        this.eat = eat;
    }
    public void Speaking(String speak) {
        this.speak = speak;
    }
    public void Walking (String walk) {
        this.walk = walk;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    public String getWalk() {
        return walk;
    }

    public void setWalk(String walk) {
        this.walk = walk;
    }

    // Eat / Speaks / Walks

    public static void eatsPineapple() {
        System.out.println("is eating pineapples");
    }
    public static void eatsFishies() {
        System.out.println("is eating fishes");
    }

    public static void speaksEnglish() {
        System.out.println("is speaking English");
    }

    public static void speaksDutch() {
        System.out.println("is speaking Dutch");
    }

    public static void walksAlot() {
        System.out.println("is walking very far");
    }

    public static void walksAbit() {
        System.out.println("is walking in circles");
    }

}
