public class Party {

    public final String name;
    public final int deputies;

    Party(String name, int deputies) {
        this.name = name;
        this.deputies = deputies;
    }

    @Override
    public String toString() {
        return this.name + " " + this.deputies;
    }
}
