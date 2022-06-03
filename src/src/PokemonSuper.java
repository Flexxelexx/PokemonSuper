public class PokemonSuper {

    private String eat;
    private String speak;
    private String walk;

    public void Eating (String eat) {
        this.eat = eat;
    }
    public void Speaking (String speak) {
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

    public String eatsPineapple() {
        System.out.println("is eating pineapples");
        return eat;
    }
    public String eatsFishies() {
        System.out.println("is eating fishes");
        return eat;
    }

    public String speaksEnglish() {
        System.out.println("is speaking english");
        return speak;
    }

    public String speaksDutch() {
        System.out.println("is speaking Dutch");
        return speak;
    }

    public String walksAlot() {
        System.out.println("is walking very far");
        return walk;
    }

    public String walksAbit() {
        System.out.println("is walking in circles");
        return walk;
    }

}
