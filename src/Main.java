public class Main {

    public static void main(String[] args) {
        Coalition parties = new Coalition()
                .addParty(new Party("ANO", 78))
                .addParty(new Party("ODS", 25))
                .addParty(new Party("PIR", 22))
                .addParty(new Party("SPD", 22))
                .addParty(new Party("KSCM", 15))
                .addParty(new Party("CSSD", 15))
                .addParty(new Party("KDUCL", 10))
                .addParty(new Party("TOP09", 7))
                .addParty(new Party("STAN", 6));

        Generator.generate(parties);
    }
}
