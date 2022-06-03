public class PokemonSuper {

    public String eat;
    public String speak;
    public String walk;

    public MovementBehaviour() {

    }

    public MovementBehaviour (String eat, String speak, String walk) {
        this.eat = eat;
        this.speak = speak;
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

}
