public class Generator {
    private static void generate(Coalition possibleParties, Coalition current, int index){
        if(possibleParties.getPartiesCount() == index){
            if(current.getDeputiesCount() > 100){
                System.out.println(current);
            }
        } else {
            Coalition extended = current.addParty(possibleParties.getParty(index));

            Generator.generate(possibleParties, extended, index + 1);
            Generator.generate(possibleParties, current, index + 1);
        }
    }

    public static void generate(Coalition parties) {
        Generator.generate(parties, new Coalition(), 0);
    }
}
