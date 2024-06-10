package pokemon2;

public class Pokemon2 {

    public static int[] mergeHP(int[] yourHP, int[] teammateHP) {
        int length = yourHP.length;
        int[] mergedHP = new int[length];

        for (int i = 0; i < length; i++) {
            int yourIndex = i;
            int teammateIndex = length - 1 - i;

            // If one of the pokemons is knocked out, set their HP to 0
            int yourPokemonHP = (yourIndex < yourHP.length) ? yourHP[yourIndex] : 0;
            int teammatePokemonHP = (teammateIndex >= 0 && teammateIndex < teammateHP.length) ? teammateHP[teammateIndex] : 0;

            // Add the HP from both pokemons
            mergedHP[i] = yourPokemonHP + teammatePokemonHP;
        }

        return mergedHP;
    }

    public static void main(String[] args) {
        int[] yourHP = {60, 50, 40};
        int[] teammateHP = {30, 20, 10};

        int[] mergedHP = mergeHP(yourHP, teammateHP);

        // Output the merged HP
        for (int hp : mergedHP) {
            System.out.print(hp + " ");
        }
    }
}
