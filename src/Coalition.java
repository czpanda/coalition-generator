import java.util.ArrayList;
import java.util.stream.Collectors;

public class Coalition {
    private final ArrayList<Party> parties;

    private Coalition(ArrayList<Party> parties) {
        this.parties = parties;
    }

    Coalition() {
        this.parties = new ArrayList<>();
    }

    public Coalition addParty(Party party) {
        ArrayList<Party> updatedParties = new ArrayList<>(this.parties);
        updatedParties.add(party);

        return new Coalition(updatedParties);
    }

    public int getDeputiesCount() {
        return this.parties
            .stream()
            .map(c -> c.deputies)
            .reduce(0, (acc, cur) -> acc + cur);
    }

    public Party getParty(int index) {
        return parties.get(index);
    }

    public int getPartiesCount() {
        return this.parties.size();
    }

    @Override
    public String toString() {
        return "(" + this.getDeputiesCount() + ") " + parties
            .stream()
            .map(p -> p.name)
            .collect(Collectors.joining(", "));
    }
}
