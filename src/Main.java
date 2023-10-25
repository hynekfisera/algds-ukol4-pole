public class Main {
    public static void main(String[] args) {
        String[] original = {"bílá", "červená", "zelená", "modrá", "fialová"};
        String[] kopie = new String[original.length];

        for (int i = 0; i < original.length; i++) {
            kopie[i] = original[i];
        }

        vypisPole(original);
        vypisPole(kopie);
    }

    public static void vypisPole(String[] pole) {
        for (String prvek :
                pole) {
            System.out.println(prvek);
        }
    }
}